
package com.ladzani.quickstart.repositories;

import com.ladzani.quickstart.TestDataUtil;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD) // this is to say we should "clean" the context after every test method below
public class AuthorEntityRepositoryIntegrationTests {

    private final AuthorRepository underTest;

    @Autowired
    public AuthorEntityRepositoryIntegrationTests(final AuthorRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testThatAuthorCanBeCreatedAndRecalled() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();
        underTest.save(authorEntity);
        Optional<AuthorEntity> result = underTest.findById(authorEntity.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(authorEntity);
    }

    @Test
    public void testThatMultipleAuthorsCanBeCreatedAndBeCalled() {
        AuthorEntity authorEntityA = TestDataUtil.createAuthorForTestA();
        underTest.save(authorEntityA);

        AuthorEntity authorEntityB = TestDataUtil.createAuthorForTestB();
        underTest.save(authorEntityB);

        AuthorEntity authorEntityC = TestDataUtil.createAuthorForTestC();
        underTest.save(authorEntityC);

        Iterable<AuthorEntity> results = underTest.findAll();

        assertThat(results).hasSize(3).containsExactly(authorEntityA, authorEntityB, authorEntityC);

    }
    @Test
    public void testThatAuthorCanBeUpdated() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();
        underTest.save(authorEntity);

        authorEntity.setName("new Author Name");
        underTest.save(authorEntity);

        Optional<AuthorEntity> result = underTest.findById(1L);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(authorEntity);

    }

    @Test
    public void testThatAuthorCanBeDeleted() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();
        underTest.save(authorEntity);

        underTest.deleteById(authorEntity.getId());

       Optional<AuthorEntity> result = underTest.findById(authorEntity.getId());

       assertThat(result).isNotPresent();

    }

    @Test
    public void testThatAuthorsLessThanAreRetrieved() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();
        underTest.save(authorEntity);

        AuthorEntity authorEntityB = TestDataUtil.createAuthorForTestB();
        underTest.save(authorEntityB);

        AuthorEntity authorEntityC = TestDataUtil.createAuthorForTestC();
        underTest.save(authorEntityC);

        Iterable<AuthorEntity> result = underTest.ageLessThan(50);
        assertThat(result).containsExactly(authorEntityB, authorEntityC);
    }

    @Test
    public void testThatAuthorsWithAgeGreaterThanAreRetrieved() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();
        underTest.save(authorEntity);

        AuthorEntity authorEntityB = TestDataUtil.createAuthorForTestB();
        underTest.save(authorEntityB);

        AuthorEntity authorEntityC = TestDataUtil.createAuthorForTestC();
        underTest.save(authorEntityC);

        Iterable<AuthorEntity> result = underTest.findAuthorsWithAgeGreaterThan(50);

        assertThat(result).containsExactly(authorEntity);
    }

}
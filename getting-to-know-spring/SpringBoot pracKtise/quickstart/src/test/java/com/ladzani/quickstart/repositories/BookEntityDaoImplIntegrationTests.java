
package com.ladzani.quickstart.repositories;

import com.ladzani.quickstart.TestDataUtil;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.domain.entities.BookEntity;
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
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookEntityDaoImplIntegrationTests {

    private final BookRepository underTest;



    @Autowired
    public BookEntityDaoImplIntegrationTests(final BookRepository underTest) {

        this.underTest = underTest;
    }

    @Test
    public void testThatBookCreatedAndCanBeRecalled() {

        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();

        BookEntity bookEntity = TestDataUtil.createBookForTest(authorEntity);

        underTest.save(bookEntity);
        Optional<BookEntity> results = underTest.findById(bookEntity.getIsbn());

        assertThat(results).isPresent();
        assertThat(results.get()).isEqualTo(bookEntity);
    }


    @Test
    public void testThatMultipleBooksCanBeCreatedAndCanBeRecalled() {

        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();

        BookEntity bookEntityA = TestDataUtil.createBookForTestA(authorEntity);
        underTest.save(bookEntityA);

        BookEntity bookEntityB = TestDataUtil.createBookForTestB(authorEntity);
        underTest.save(bookEntityB);

        BookEntity bookEntityC = TestDataUtil.createBookForTestC(authorEntity);
        underTest.save(bookEntityC);

        Iterable<BookEntity> results = underTest.findAll();

        assertThat(results)
                .hasSize(3)
                .containsExactly(bookEntityA, bookEntityB, bookEntityC);
    }

    @Test
    public void testThatBookCanBeUpdated() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();

        BookEntity bookEntity = TestDataUtil.createBookForTest(authorEntity);
        underTest.save(bookEntity);

        bookEntity.setTitle("New Book Name");
        underTest.save(bookEntity);

       Optional<BookEntity> result = underTest.findById(bookEntity.getIsbn());
       assertThat(result).isPresent();
       assertThat(result.get()).isEqualTo(bookEntity);
    }


    @Test
    public void testThatBookCanBeDeleted() {
        AuthorEntity authorEntity = TestDataUtil.createAuthorForTest();


        BookEntity bookEntity = TestDataUtil.createBookForTest(authorEntity);

        underTest.save(bookEntity);
        underTest.deleteById(bookEntity.getIsbn());
        Optional<BookEntity> result =  underTest.findById(bookEntity.getIsbn());

        assertThat(result).isNotPresent();

    }

}


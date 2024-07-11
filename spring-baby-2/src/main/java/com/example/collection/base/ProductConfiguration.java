package com.example.collection.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    // I have become clumsy man, i'm scared of what is going on with me right now!
    // I feel like i won't be able to keep a high level job.
    // I have been trying to get back in shape but still this shit ain't working....
    // i'm a push this note to git-hub as well probably check on it some time in the future!
    // who knows where will i be then and what will i be doing with my life
    // only goes knows
    @Bean(name = "product-view")
    public ProductViewer productViewer()  {
        return new ProductViewer();
    }
    @Bean(name = "james-product")
    public Product product() {
        // the name attribute in the bean annotation will be associated with the object being returned here
        return new Product("1", "laptop");
    }
    // should be able to replicate what we are learning here man!

    @Bean
    public Product product7() {
        return new Product("7", "cup");
    }
    @Bean
    public Product product6() {
        return new Product("6", "phone");
    }
    @Bean
    public Product product5() {
        return new Product("5", "blanket");
    }
    @Bean
    public Product product4() {
        return new Product("4", "monitor");
    }
    @Bean
    public Product product3() {
        return new Product("3", "keyboard");
    }@Bean
    public Product product2() {
        return new Product("2", "bike");
    }

    /* for some serious notes
    the @Bean annotation has some attributes that we should know of:
    one of them is name as seen in the first bean returned
    the name attribute refers to the bean being returned by that particular method...
    and so the spring container will associate that bean with that name internally too
    as seen in when ProductViewer gets called using the Map Collection, it uses this name in its Key attribute
    * */

}

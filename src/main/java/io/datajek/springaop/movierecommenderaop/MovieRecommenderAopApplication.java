package io.datajek.springaop.movierecommenderaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication

public class MovieRecommenderAopApplication {



    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderAopApplication.class, args);
    }



}
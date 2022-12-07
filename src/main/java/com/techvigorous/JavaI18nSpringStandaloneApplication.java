package com.techvigorous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@SpringBootApplication
public class JavaI18nSpringStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaI18nSpringStandaloneApplication.class, args);

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("i18n/messages");

        System.out.println(messageSource.getMessage("hello", null, Locale.FRENCH));
    }

}
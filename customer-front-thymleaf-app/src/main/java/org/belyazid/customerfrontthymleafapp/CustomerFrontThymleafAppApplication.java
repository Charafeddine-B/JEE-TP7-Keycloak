package org.belyazid.customerfrontthymleafapp;

import org.belyazid.customerfrontthymleafapp.entities.Customer;
import org.belyazid.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("belyazid").email("belya@me.com").build());
            customerRepository.save(Customer.builder().name("salwa").email("salwa@me.com").build());
            customerRepository.save(Customer.builder().name("mohamed").email("soso@ss.com").build());
        };
    }
}

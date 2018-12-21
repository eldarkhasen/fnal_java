package com.eldar.final_ws.bootstrap;

import com.eldar.final_ws.domain.Customer;
import com.eldar.final_ws.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private  final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading customer data");
        Customer c1 = new Customer("Eldar","Khasen");

        customerRepository.save(c1);

        Customer c2 = new Customer("Cristiano","Ronaldo");

        customerRepository.save(c2);

        Customer c3 = new Customer("Lionel","Messi");

        customerRepository.save(c3);

        System.out.println("Customers saved: "+customerRepository.count());
    }
}

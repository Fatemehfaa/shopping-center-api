package org.example.shoppingcenter.customer;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;

    public void createCustomer(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }
}

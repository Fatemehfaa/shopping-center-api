package org.example.shoppingcenter.customer;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CustomerService {

    CustomerRepository customerRepository;

    public CustomerDto create(CustomerDto customer) {
        CustomerEntity entity = CustomerMapper.INSTANCE.toEntity(customer);
        return CustomerMapper.INSTANCE.toDto(customerRepository.save(entity));
    }

    public CustomerDto findById(Long id) {
        return CustomerMapper.INSTANCE.toDto(customerRepository.findById(id).orElse(null));
    }

    public CustomerDto update(CustomerDto customerDto) {
        CustomerEntity customer = customerRepository.findById(customerDto.getId()).orElseThrow();
        CustomerMapper.INSTANCE.updateToDto(customer, customerDto);
        return CustomerMapper.INSTANCE.toDto(customerRepository.save(customer));
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    public List<CustomerDto> findAll() {
        return CustomerMapper.INSTANCE.listToDto(customerRepository.findAll());
    }
}

package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.application.port.IPasswordEncryption;
import org.vet.management.application.port.out.ICustomerRepository;
import org.vet.management.domain.model.Customer;

import java.util.List;
@ApplicationScoped
public class CustomerService {
  @Inject
  ICustomerRepository customerRepository;
  @Inject
  IPasswordEncryption passwordEncryption;
  public List<Customer> getAllCustomers() {
    return customerRepository.getAllCustomer();
  }

  public Customer getCustomerById(String id) {
    return customerRepository.getCustomerById(id);
  }

  public Customer createCustomer(Customer customer) {
    customer.setPassword(passwordEncryption.encryptPassword(customer.getPassword()));
    return customerRepository.createCustomer(customer);
  }

  public Customer updateCustomer(String id, Customer customer) {
    customer.setPassword(passwordEncryption.encryptPassword(customer.getPassword()));
    return customerRepository.updateCustomer(id, customer);
  }

  public Customer deleteCustomer(String id) {
    return customerRepository.deleteCustomer(id);
  }
}

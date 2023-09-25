package org.vet.management.application.port.out;

import org.vet.management.domain.model.Customer;

import java.util.List;

public interface ICustomerRepository {
  List<Customer> getAllCustomer();
  Customer getCustomerById(String id);
  Customer createCustomer(Customer customer);
  Customer updateCustomer(String id, Customer customer);
  Customer deleteCustomer(String id);
}

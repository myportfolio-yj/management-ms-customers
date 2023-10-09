package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.application.port.out.ICustomerRepository;
import org.vet.management.domain.model.Customer;
import org.vet.management.domain.model.CustomerEntity;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class CustomerRepository implements PanacheMongoRepository<CustomerEntity>, ICustomerRepository {
  @Override
  public List<Customer> getAllCustomer() {
    return listAll().stream().map(p -> {
      Customer customer = new Customer();
      customer.setId(p.id.toString());
      customer.setName(p.name);
      customer.setLastname(p.lastname);
      customer.setEmail(p.email);
      customer.setCellPhone(p.cellPhone);
      customer.setPhone(p.phone);
      customer.setPassword(p.password);
      customer.setIdDocument(p.idDocument);
      return customer;
    }).toList();
  }

  @Override
  public Customer getCustomerById(String id) {
    Optional<CustomerEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Customer();
    }
    CustomerEntity customerEntity = optional.get();
    Customer customer = new Customer();
    customer.setId(customerEntity.id.toString());
    customer.setName(customerEntity.name);
    customer.setLastname(customerEntity.lastname);
    customer.setEmail(customerEntity.email);
    customer.setCellPhone(customerEntity.cellPhone);
    customer.setPhone(customerEntity.phone);
    customer.setPassword(customerEntity.password);
    customer.setIdDocument(customerEntity.idDocument);
    return customer;
  }

  @Override
  public Customer createCustomer(Customer customer) {
    CustomerEntity customerEntity = new CustomerEntity();
    customerEntity.setName(customer.getName());
    customerEntity.setLastname(customer.getLastname());
    customerEntity.setEmail(customer.getEmail());
    customerEntity.setCellPhone(customer.getCellPhone());
    customerEntity.setPhone(customer.getPhone());
    customerEntity.setPassword(customer.getPassword());
    customerEntity.setIdDocument(customer.getIdDocument());
    customerEntity.persist();
    Customer customer2 = new Customer();
    customer2.setId(customerEntity.id.toString());
    customer2.setName(customerEntity.name);
    customer2.setLastname(customerEntity.lastname);
    customer2.setEmail(customerEntity.email);
    customer2.setCellPhone(customerEntity.cellPhone);
    customer2.setPhone(customerEntity.phone);
    customer2.setPassword(customerEntity.password);
    customer2.setIdDocument(customerEntity.idDocument);
    return customer2;
  }

  @Override
  public Customer updateCustomer(String id, Customer customer) {
    Optional<CustomerEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()) {
      return new Customer();
    }
    CustomerEntity customerEntity = optional.get();
    customerEntity.setName(customer.getName());
    customerEntity.setLastname(customer.getLastname());
    customerEntity.setEmail(customer.getEmail());
    customerEntity.setCellPhone(customer.getCellPhone());
    customerEntity.setPhone(customer.getPhone());
    customerEntity.setPassword(customer.getPassword());
    customerEntity.setIdDocument(customer.getIdDocument());
    customerEntity.persist();
    Customer customer2 = new Customer();
    customer2.setId(customerEntity.id.toString());
    customer2.setName(customerEntity.name);
    customer2.setLastname(customerEntity.lastname);
    customer2.setEmail(customerEntity.email);
    customer2.setCellPhone(customerEntity.cellPhone);
    customer2.setPhone(customerEntity.phone);
    customer2.setPassword(customerEntity.password);
    customer2.setIdDocument(customerEntity.idDocument);
    return customer2;
  }

  @Override
  public Customer deleteCustomer(String id) {
    Optional<CustomerEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()) {
      return new Customer();
    }
    CustomerEntity customerEntity = optional.get();
    delete(customerEntity);
    Customer customer = new Customer();
    customer.setId(customerEntity.id.toString());
    customer.setName(customerEntity.name);
    customer.setLastname(customerEntity.lastname);
    customer.setEmail(customerEntity.email);
    customer.setCellPhone(customerEntity.cellPhone);
    customer.setPhone(customerEntity.phone);
    customer.setPassword(customerEntity.password);
    customer.setIdDocument(customerEntity.idDocument);
    return customer;
  }
}

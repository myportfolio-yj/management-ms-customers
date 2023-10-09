package org.vet.management.infraestructure.adapter.in.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.customer.IGetCustomer;
import org.vet.management.domain.service.CustomerService;

public class GetCustomersResource implements IGetCustomer {
  @Inject
  CustomerService customerService;
  @Override
  public Response getCustomer() {
    return Response.ok(customerService.getAllCustomers()).build();
  }
}

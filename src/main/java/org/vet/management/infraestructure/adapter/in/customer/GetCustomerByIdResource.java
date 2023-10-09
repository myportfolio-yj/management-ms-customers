package org.vet.management.infraestructure.adapter.in.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.customer.IGetCustomerById;
import org.vet.management.domain.service.CustomerService;

public class GetCustomerByIdResource implements IGetCustomerById {
  @Inject
  CustomerService customerService;
  @Override
  public Response getUserById(String idCustomer) {
    return Response.ok(customerService.getCustomerById(idCustomer)).build();
  }
}

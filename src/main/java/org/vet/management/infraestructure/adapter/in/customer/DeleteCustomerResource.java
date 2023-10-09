package org.vet.management.infraestructure.adapter.in.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.customer.IDeleteCustomer;
import org.vet.management.domain.service.CustomerService;

public class DeleteCustomerResource implements IDeleteCustomer {
  @Inject
  CustomerService customerService;
  @Override
  public Response deleteCustomer(String idCustomer) {
    return Response.ok(customerService.deleteCustomer(idCustomer)).build();
  }
}

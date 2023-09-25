package org.vet.management.application.port.out;

import org.vet.management.domain.model.Address;

import java.util.List;

public interface IAddressRepository {
  List<Address> getAllAddress();
  Address getAddressById(String id);
  Address createAddress(Address address);
  Address updateAddress(String id, Address address);
  Address deleteAddress(String id);
}

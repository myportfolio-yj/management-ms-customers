package org.vet.management.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Customer {
  public String id;
  public String name;
  public String lastname;
  public String email;
  public String phone;
  public String cellPhone;
  public String password;
  public String idDocument;
}

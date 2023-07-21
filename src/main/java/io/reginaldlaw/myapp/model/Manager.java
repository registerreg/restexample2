package io.reginaldlaw.myapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "phone",
    "jurisdiction",
    "identificationNumber",
    "firstName",
    "lastName" 
})


public class Manager implements Serializable {
    
  
  private static final long serialVersionUID = 5541656277876272539L;

@JsonProperty("id")
  private String id;
  
  @JsonProperty("phone")
  private String phone;
  
   @JsonProperty("jurisdiction")
   private String jurisdiction;
   
   @JsonProperty("identificationNumber")
   private String identificationNumber;
   
   @JsonProperty("firstName")
   private String firstName;
   
   @JsonProperty("lastName")
   private String lastName;

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getJurisdiction() {
    return jurisdiction;
}

public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
}

public String getIdentificationNumber() {
    return identificationNumber;
}

public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}
   
   
   
}
    

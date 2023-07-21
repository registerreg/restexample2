package io.reginaldlaw.myapp.model;

public class EmployeeBean {
    
    
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String supervisor;
    
    public EmployeeBean() {
        super();
    }
    
    public EmployeeBean(String firstName, String lastName, String email, String phoneNumber, String supervisor) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.supervisor = supervisor;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

}

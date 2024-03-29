
package com.pulkit.Registrationwithspringsecurity.web.dto;

public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    
    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String firstname, String lastname, String email, String password) {
        firstName = firstname;
        lastName = lastname;
        this.email = email;
        this.password = password;
    }

    

    public String getFirstname() {
        return firstName;
    }
    public void setFirstname(String firstname) {
        firstName = firstname;
    }
    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        lastName = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
     
}
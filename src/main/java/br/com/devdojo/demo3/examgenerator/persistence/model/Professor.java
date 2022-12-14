package br.com.devdojo.demo3.examgenerator.persistence.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Professor extends AbstractEntity{

    @NotEmpty(message = "The field name cannot be empty")
    private String name;
    @Email(message = "This email is not valid")
    @NotEmpty(message = "The field email cannot be empty")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

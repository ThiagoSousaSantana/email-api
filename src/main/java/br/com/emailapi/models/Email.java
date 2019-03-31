package br.com.emailapi.models;

import java.io.Serializable;

public class Email implements Serializable {
    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.Email
    private String emailAdress;
    private String name;
    private String message;

    public Email() {

    }

    public Email(String emailAdress, String name, String message) {
        this.emailAdress = emailAdress;
        this.name = name;
        this.message = message;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

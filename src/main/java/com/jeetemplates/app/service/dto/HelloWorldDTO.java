/**
 * 
 */
package com.jeetemplates.app.service.dto;

import com.jeetemplates.app.common.dto.GenericDTO;

/**
 * Hello world dto
 * 
 * @author jeetemplates
 */
public class HelloWorldDTO extends GenericDTO {

    /**
     * Serial UID.
     */
    private static final long serialVersionUID = -4404486271848958120L;

    /**
     * Last name.
     */
    private String lastName;

    /**
     * First name.
     */
    private String firstName;

    /**
     * Email.
     */
    private String email;

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

/**
 * 
 */
package com.jeetemplates.app.web.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jeetemplates.app.domain.HelloWorld;

/**
 * Validate {@link HelloWorld}.
 * 
 * @author jeetemplates
 * 
 */
@Component
public class HelloWorldValidator implements Validator {

    /**
     * @see org.springframework.validation.Validator#supports(java.lang.Class)
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return HelloWorld.class.equals(clazz);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.validation.Validator#validate(java.lang.Object,
     * org.springframework.validation.Errors)
     */
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "validation.notempty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "validation.notempty");
        HelloWorld hello = (HelloWorld) target;
        if (hello.getEmail() != null && hello.getEmail().length() > 0) {
            if (!hello.getEmail().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\." + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*" + "@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")) {
                errors.rejectValue("email", "validation.email");
            }
        }
    }

}

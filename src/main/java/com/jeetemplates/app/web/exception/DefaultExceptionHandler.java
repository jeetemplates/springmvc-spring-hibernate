/**
 * 
 */
package com.jeetemplates.app.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Exception handler for all controllers.
 * 
 * @author jeetemplates
 * 
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    /**
     * Generic handler method. Be careful of parameters. See
     * {@link ExceptionHandler} for allowed params and allowed returns.
     * 
     * @param exception
     *            : thrown exception
     * @return {@link ModelAndView}
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException(Exception exception) {
        ModelAndView model = new ModelAndView();
        model.setViewName("error");
        model.addObject("errorCode", exception.getClass().getSimpleName());
        model.addObject("errorMessage", exception.getLocalizedMessage());
        return model;
    }

}

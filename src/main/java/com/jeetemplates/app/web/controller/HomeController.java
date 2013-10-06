/**
 * 
 */
package com.jeetemplates.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeetemplates.app.domain.HelloWorld;
import com.jeetemplates.app.service.HelloWorldService;
import com.jeetemplates.app.web.exception.DefaultExceptionHandler;
import com.jeetemplates.app.web.validator.HelloWorldValidator;

/**
 * Home controller. If {@link RequestMapping} is specified on class, it will be
 * a prefix. Moreover, it is posible to define only one GET and one POST method
 * and it will be mapped on the same url.
 * 
 * @author jeetemplates
 */
@Controller
public class HomeController {

    /* ************************************ */
    /* Dependencies */
    /* ************************************ */

    /**
     * {@link HelloWorldService}
     */
    @Autowired
    private HelloWorldService helloWorldService;

    /**
     * {@link HelloWorldValidator}.
     */
    @Autowired
    private HelloWorldValidator helloWorldValidator;

    /* ************************************ */
    /* Methods */
    /* ************************************ */

    /**
     * Display home page.
     * 
     * @param model
     *            : {@link Model}
     * @return home page
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("newHello", new HelloWorld());
        return "home";
    }

    /**
     * Add hello.
     * 
     * @param model
     *            : {@link Model}
     * @return redirect to hello list page
     */
    @RequestMapping(value = "/addHello", method = RequestMethod.POST)
    public String addHello(@ModelAttribute(value = "newHello") HelloWorld newHello, BindingResult result) {
        helloWorldValidator.validate(newHello, result);
        if (result.hasErrors()) {
            return "home";
        }
        helloWorldService.create(newHello);
        return "redirect:listHello";
    }

    /**
     * Display hello list page.
     * 
     * @param model
     *            : {@link Model}
     * @return hello list page
     */
    @RequestMapping(value = "/listHello", method = RequestMethod.GET)
    public String listHello(Model model) {
        model.addAttribute("list", helloWorldService.retrieveAll());
        return "list";
    }

    /**
     * Throw exception to show exception handling
     * {@link DefaultExceptionHandler}.
     */
    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public void throwException() throws Exception {
        throw new NullPointerException();
    }
    
}

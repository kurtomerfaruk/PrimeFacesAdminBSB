package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employee;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "employeeController")
@ViewScoped
public class EmployeeController extends AbstractController<Employee> {
    private static final long serialVersionUID = -6004325932575069247L;

    public EmployeeController() {
        // Inform the Abstract parent controller of the concrete Employee Entity
        super(Employee.class);
    }

}

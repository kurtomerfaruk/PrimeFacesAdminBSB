package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Employee;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "employeeController")
@ViewScoped
public class EmployeeController extends AbstractController<Employee> {

    public EmployeeController() {
        // Inform the Abstract parent controller of the concrete Employee Entity
        super(Employee.class);
    }

}

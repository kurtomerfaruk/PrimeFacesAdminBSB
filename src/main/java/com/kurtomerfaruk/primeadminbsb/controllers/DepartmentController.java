package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Department;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "departmentController")
@ViewScoped
public class DepartmentController extends AbstractController<Department> {

    public DepartmentController() {
        // Inform the Abstract parent controller of the concrete Department Entity
        super(Department.class);
    }

}

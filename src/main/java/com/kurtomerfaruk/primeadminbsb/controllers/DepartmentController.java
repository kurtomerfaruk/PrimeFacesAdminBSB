package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Department;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "departmentController")
@ViewScoped
public class DepartmentController extends AbstractController<Department> {
    private static final long serialVersionUID = -6404601312749603774L;

    public DepartmentController() {
        // Inform the Abstract parent controller of the concrete Department Entity
        super(Department.class);
    }

}

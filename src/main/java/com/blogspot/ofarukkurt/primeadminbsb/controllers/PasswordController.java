package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Password;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "passwordController")
@ViewScoped
public class PasswordController extends AbstractController<Password> {

    @Inject
    private PersonController personController;

    public PasswordController() {
        // Inform the Abstract parent controller of the concrete Password Entity
        super(Password.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        personController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Person controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePerson(ActionEvent event) {
        if (this.getSelected() != null && personController.getSelected() == null) {
            personController.setSelected(this.getSelected().getPerson());
        }
    }
}

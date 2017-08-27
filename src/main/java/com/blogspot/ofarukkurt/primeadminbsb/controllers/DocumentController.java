package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Document;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "documentController")
@ViewScoped
public class DocumentController extends AbstractController<Document> {

    @Inject
    private EmployeeController ownerController;

    public DocumentController() {
        // Inform the Abstract parent controller of the concrete Document Entity
        super(Document.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        ownerController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Employee controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareOwner(ActionEvent event) {
        if (this.getSelected() != null && ownerController.getSelected() == null) {
            ownerController.setSelected(this.getSelected().getOwner());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Productdocument entities
     * that are retrieved from Document?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productdocument page
     */
    public String navigateProductdocumentList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productdocument_items", this.getSelected().getProductdocumentList());
        }
        return "/productdocument/index";
    }

}

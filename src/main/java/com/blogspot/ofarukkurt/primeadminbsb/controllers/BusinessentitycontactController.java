package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Businessentitycontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "businessentitycontactController")
@ViewScoped
public class BusinessentitycontactController extends AbstractController<Businessentitycontact> {
    private static final long serialVersionUID = -6071343899547568426L;

    @Inject
    private PersonController personController;
    @Inject
    private ContacttypeController contacttypeController;
    @Inject
    private BusinessentityController businessentityController;

    public BusinessentitycontactController() {
        // Inform the Abstract parent controller of the concrete Businessentitycontact Entity
        super(Businessentitycontact.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getBusinessentitycontactPK().setBusinessEntityID(this.getSelected().getBusinessentity().getBusinessEntityID());
        this.getSelected().getBusinessentitycontactPK().setPersonID(this.getSelected().getPerson().getBusinessEntityID());
        this.getSelected().getBusinessentitycontactPK().setContactTypeID(this.getSelected().getContacttype().getContactTypeID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setBusinessentitycontactPK(new com.blogspot.ofarukkurt.primeadminbsb.models.BusinessentitycontactPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        personController.setSelected(null);
        contacttypeController.setSelected(null);
        businessentityController.setSelected(null);
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

    /**
     * Sets the "selected" attribute of the Contacttype controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareContacttype(ActionEvent event) {
        if (this.getSelected() != null && contacttypeController.getSelected() == null) {
            contacttypeController.setSelected(this.getSelected().getContacttype());
        }
    }

    /**
     * Sets the "selected" attribute of the Businessentity controller in order
     * to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBusinessentity(ActionEvent event) {
        if (this.getSelected() != null && businessentityController.getSelected() == null) {
            businessentityController.setSelected(this.getSelected().getBusinessentity());
        }
    }
}

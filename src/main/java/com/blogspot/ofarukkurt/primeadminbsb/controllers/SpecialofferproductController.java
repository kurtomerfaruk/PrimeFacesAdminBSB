package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Specialofferproduct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "specialofferproductController")
@ViewScoped
public class SpecialofferproductController extends AbstractController<Specialofferproduct> {

    @Inject
    private SpecialofferController specialofferController;
    @Inject
    private ProductController productController;

    public SpecialofferproductController() {
        // Inform the Abstract parent controller of the concrete Specialofferproduct Entity
        super(Specialofferproduct.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getSpecialofferproductPK().setSpecialOfferID(this.getSelected().getSpecialoffer().getSpecialOfferID());
        this.getSelected().getSpecialofferproductPK().setProductID(this.getSelected().getProduct().getProductID());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSpecialofferproductPK(new com.blogspot.ofarukkurt.primeadminbsb.models.SpecialofferproductPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        specialofferController.setSelected(null);
        productController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Specialoffer controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSpecialoffer(ActionEvent event) {
        if (this.getSelected() != null && specialofferController.getSelected() == null) {
            specialofferController.setSelected(this.getSelected().getSpecialoffer());
        }
    }

    /**
     * Sets the "selected" attribute of the Product controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProduct(ActionEvent event) {
        if (this.getSelected() != null && productController.getSelected() == null) {
            productController.setSelected(this.getSelected().getProduct());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Salesorderdetail entities
     * that are retrieved from Specialofferproduct?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Salesorderdetail page
     */
    public String navigateSalesorderdetailList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Salesorderdetail_items", this.getSelected().getSalesorderdetailList());
        }
        return "/salesorderdetail/index";
    }

}

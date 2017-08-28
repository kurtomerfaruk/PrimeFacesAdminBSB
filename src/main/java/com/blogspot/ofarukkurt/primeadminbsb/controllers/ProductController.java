package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Product;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:30:22 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */

@Named(value = "productController")
@ViewScoped
public class ProductController extends AbstractController<Product> {

    @Inject
    private UnitmeasureController weightUnitMeasureCodeController;
    @Inject
    private UnitmeasureController sizeUnitMeasureCodeController;
    @Inject
    private ProductsubcategoryController productSubcategoryIDController;
    @Inject
    private ProductmodelController productModelIDController;
    @Inject
    private MenuController menuController;

    public ProductController() {
        // Inform the Abstract parent controller of the concrete Product Entity
        super(Product.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    @Override
    public void resetParents() {
        weightUnitMeasureCodeController.setSelected(null);
        sizeUnitMeasureCodeController.setSelected(null);
        productSubcategoryIDController.setSelected(null);
        productModelIDController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of Transactionhistory
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateTransactionhistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Transactionhistory_items", this.getSelected().getTransactionhistoryList());
        }
        menuController.setPageLink("/transactionhistory/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productproductphoto
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateProductproductphotoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productproductphoto_items", this.getSelected().getProductproductphotoList());
        }
        menuController.setPageLink("/productproductphoto/index");
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderdetail
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigatePurchaseorderdetailList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Purchaseorderdetail_items", this.getSelected().getPurchaseorderdetailList());
        }
        menuController.setPageLink("/purchaseorderdetail/index");
    }

    /**
     * Sets the "items" attribute with a collection of Billofmaterials entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateBillofmaterialsList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Billofmaterials_items", this.getSelected().getBillofmaterialsList());
        }
        menuController.setPageLink("/billofmaterials/index");
    }

    /**
     * Sets the "items" attribute with a collection of Billofmaterials entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateBillofmaterialsList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Billofmaterials_items", this.getSelected().getBillofmaterialsList1());
        }
        menuController.setPageLink("/billofmaterials/index");
    }

    /**
     * Sets the "items" attribute with a collection of Specialofferproduct
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateSpecialofferproductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Specialofferproduct_items", this.getSelected().getSpecialofferproductList());
        }
        menuController.setPageLink("/specialofferproduct/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productlistpricehistory
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productlistpricehistory page
     */
    public void navigateProductlistpricehistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productlistpricehistory_items", this.getSelected().getProductlistpricehistoryList());
        }
        menuController.setPageLink("/productlistpricehistory/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productvendor entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateProductvendorList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productvendor_items", this.getSelected().getProductvendorList());
        }
        menuController.setPageLink("/productvendor/index");
    }

    /**
     * Sets the "items" attribute with a collection of Shoppingcartitem entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateShoppingcartitemList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Shoppingcartitem_items", this.getSelected().getShoppingcartitemList());
        }
        menuController.setPageLink("/shoppingcartitem/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productdocument entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateProductdocumentList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productdocument_items", this.getSelected().getProductdocumentList());
        }
        menuController.setPageLink("/productdocument/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productcosthistory
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     */
    public void navigateProductcosthistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productcosthistory_items", this.getSelected().getProductcosthistoryList());
        }
        menuController.setPageLink("/productcosthistory/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productinventory entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productinventory page
     */
    public void navigateProductinventoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productinventory_items", this.getSelected().getProductinventoryList());
        }
        menuController.setPageLink("/productinventory/index");
    }

    /**
     * Sets the "selected" attribute of the Unitmeasure controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareWeightUnitMeasureCode(ActionEvent event) {
        if (this.getSelected() != null && weightUnitMeasureCodeController.getSelected() == null) {
            weightUnitMeasureCodeController.setSelected(this.getSelected().getWeightUnitMeasureCode());
        }
    }

    /**
     * Sets the "selected" attribute of the Unitmeasure controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSizeUnitMeasureCode(ActionEvent event) {
        if (this.getSelected() != null && sizeUnitMeasureCodeController.getSelected() == null) {
            sizeUnitMeasureCodeController.setSelected(this.getSelected().getSizeUnitMeasureCode());
        }
    }

    /**
     * Sets the "selected" attribute of the Productsubcategory controller in
     * order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductSubcategoryID(ActionEvent event) {
        if (this.getSelected() != null && productSubcategoryIDController.getSelected() == null) {
            productSubcategoryIDController.setSelected(this.getSelected().getProductSubcategoryID());
        }
    }

    /**
     * Sets the "selected" attribute of the Productmodel controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProductModelID(ActionEvent event) {
        if (this.getSelected() != null && productModelIDController.getSelected() == null) {
            productModelIDController.setSelected(this.getSelected().getProductModelID());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Workorder entities that
     * are retrieved from Product?cap_first and returns the navigation outcome.
     *
     */
    public void navigateWorkorderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Workorder_items", this.getSelected().getWorkorderList());
        }
        menuController.setPageLink("/workorder/index");
    }

    /**
     * Sets the "items" attribute with a collection of Productreview entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     */
    public void navigateProductreviewList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productreview_items", this.getSelected().getProductreviewList());
        }
        menuController.setPageLink("/productreview/index");
    }

}

package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Product;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

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

    public ProductController() {
        // Inform the Abstract parent controller of the concrete Product Entity
        super(Product.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
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
     * @return navigation outcome for Transactionhistory page
     */
    public String navigateTransactionhistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Transactionhistory_items", this.getSelected().getTransactionhistoryList());
        }
        return "/transactionhistory/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productproductphoto
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productproductphoto page
     */
    public String navigateProductproductphotoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productproductphoto_items", this.getSelected().getProductproductphotoList());
        }
        return "/productproductphoto/index";
    }

    /**
     * Sets the "items" attribute with a collection of Purchaseorderdetail
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Purchaseorderdetail page
     */
    public String navigatePurchaseorderdetailList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Purchaseorderdetail_items", this.getSelected().getPurchaseorderdetailList());
        }
        return "/purchaseorderdetail/index";
    }

    /**
     * Sets the "items" attribute with a collection of Billofmaterials entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Billofmaterials page
     */
    public String navigateBillofmaterialsList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Billofmaterials_items", this.getSelected().getBillofmaterialsList());
        }
        return "/billofmaterials/index";
    }

    /**
     * Sets the "items" attribute with a collection of Billofmaterials entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Billofmaterials page
     */
    public String navigateBillofmaterialsList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Billofmaterials_items", this.getSelected().getBillofmaterialsList1());
        }
        return "/billofmaterials/index";
    }

    /**
     * Sets the "items" attribute with a collection of Specialofferproduct
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Specialofferproduct page
     */
    public String navigateSpecialofferproductList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Specialofferproduct_items", this.getSelected().getSpecialofferproductList());
        }
        return "/specialofferproduct/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productlistpricehistory
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productlistpricehistory page
     */
    public String navigateProductlistpricehistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productlistpricehistory_items", this.getSelected().getProductlistpricehistoryList());
        }
        return "/productlistpricehistory/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productvendor entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productvendor page
     */
    public String navigateProductvendorList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productvendor_items", this.getSelected().getProductvendorList());
        }
        return "/productvendor/index";
    }

    /**
     * Sets the "items" attribute with a collection of Shoppingcartitem entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Shoppingcartitem page
     */
    public String navigateShoppingcartitemList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Shoppingcartitem_items", this.getSelected().getShoppingcartitemList());
        }
        return "/shoppingcartitem/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productdocument entities
     * that are retrieved from Product?cap_first and returns the navigation
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

    /**
     * Sets the "items" attribute with a collection of Productcosthistory
     * entities that are retrieved from Product?cap_first and returns the
     * navigation outcome.
     *
     * @return navigation outcome for Productcosthistory page
     */
    public String navigateProductcosthistoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productcosthistory_items", this.getSelected().getProductcosthistoryList());
        }
        return "/productcosthistory/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productinventory entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productinventory page
     */
    public String navigateProductinventoryList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productinventory_items", this.getSelected().getProductinventoryList());
        }
        return "/productinventory/index";
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
     * @return navigation outcome for Workorder page
     */
    public String navigateWorkorderList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Workorder_items", this.getSelected().getWorkorderList());
        }
        return "/workorder/index";
    }

    /**
     * Sets the "items" attribute with a collection of Productreview entities
     * that are retrieved from Product?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Productreview page
     */
    public String navigateProductreviewList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Productreview_items", this.getSelected().getProductreviewList());
        }
        return "/productreview/index";
    }

}

package com.blogspot.ofarukkurt.primeadminbsb.controllers;

import com.blogspot.ofarukkurt.primeadminbsb.models.Productdocument;
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

@Named(value = "productdocumentController")
@ViewScoped
public class ProductdocumentController extends AbstractController<Productdocument> {

    @Inject
    private ProductController productController;
    @Inject
    private DocumentController documentController;

    public ProductdocumentController() {
        // Inform the Abstract parent controller of the concrete Productdocument Entity
        super(Productdocument.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getProductdocumentPK().setProductID(this.getSelected().getProduct().getProductID());
        this.getSelected().getProductdocumentPK().setDocumentNode(this.getSelected().getDocument().getDocumentNode());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductdocumentPK(new com.blogspot.ofarukkurt.primeadminbsb.models.ProductdocumentPK());
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        productController.setSelected(null);
        documentController.setSelected(null);
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
     * Sets the "selected" attribute of the Document controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDocument(ActionEvent event) {
        if (this.getSelected() != null && documentController.getSelected() == null) {
            documentController.setSelected(this.getSelected().getDocument());
        }
    }
}

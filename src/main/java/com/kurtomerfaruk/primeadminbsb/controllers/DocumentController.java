package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Document;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "documentController")
@ViewScoped
public class DocumentController extends AbstractController<Document> {
    private static final long serialVersionUID = 7365118668517761985L;

    public DocumentController() {
        // Inform the Abstract parent controller of the concrete Document Entity
        super(Document.class);
    }

}

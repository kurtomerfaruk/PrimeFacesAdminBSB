package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Document;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "documentController")
@ViewScoped
public class DocumentController extends AbstractController<Document> {

    public DocumentController() {
        // Inform the Abstract parent controller of the concrete Document Entity
        super(Document.class);
    }

}

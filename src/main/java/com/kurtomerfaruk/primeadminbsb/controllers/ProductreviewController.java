package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Productreview;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "productreviewController")
@ViewScoped
public class ProductreviewController extends AbstractController<Productreview> {
    private static final long serialVersionUID = -1079543979872673293L;

    public ProductreviewController() {
        // Inform the Abstract parent controller of the concrete Productreview Entity
        super(Productreview.class);
    }

}

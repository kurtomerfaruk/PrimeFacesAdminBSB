package com.kurtomerfaruk.primeadminbsb.controllers;

import com.kurtomerfaruk.primeadminbsb.models.Jobcandidate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com 
 * Created on date 27.01.2017 23:11:05
 */
@Named(value = "jobcandidateController")
@ViewScoped
public class JobcandidateController extends AbstractController<Jobcandidate> {
    private static final long serialVersionUID = 2897997528807589969L;

    public JobcandidateController() {
        // Inform the Abstract parent controller of the concrete Jobcandidate Entity
        super(Jobcandidate.class);
    }

}

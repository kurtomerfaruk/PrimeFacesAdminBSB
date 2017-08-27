package com.blogspot.ofarukkurt.primeadminbsb.enums;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 20/02/2017 13:07:59
 */
public enum MenuType {

    /**
     * Main Menu
     */
    M(0),
    
    /**
     * Sub Menu
     */
    S(1);

    private final int label;

    private MenuType(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }

}

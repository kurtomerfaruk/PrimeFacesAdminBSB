package com.blogspot.ofarukkurt.primeadminbsb.converters;

import com.blogspot.ofarukkurt.primeadminbsb.enums.MenuType;
import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 20/02/2017 13:10:04 
 */
@FacesConverter(value = "menuTypeConverter")
public class MenuTypeConverter extends EnumConverter{

    public MenuTypeConverter() {
        super(MenuType.class);
    }

    
}

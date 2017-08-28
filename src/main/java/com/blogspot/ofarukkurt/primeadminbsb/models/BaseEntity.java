package com.blogspot.ofarukkurt.primeadminbsb.models;

import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.Functions;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Omer Faruk KURT
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 13/02/2017 10:16:49
 */
@MappedSuperclass
public class BaseEntity {

    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    @PrePersist
    public void prePersist() {
        modifiedDate = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        modifiedDate = new Date();
    }

}

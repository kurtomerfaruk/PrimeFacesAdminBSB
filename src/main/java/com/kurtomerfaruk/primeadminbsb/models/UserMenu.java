package com.kurtomerfaruk.primeadminbsb.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * @Created on date 13/02/2017 09:19:27
 */
@Entity
@Table(name = "user_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserMenu.findAll", query = "SELECT u FROM UserMenu u"),
    @NamedQuery(name = "UserMenu.findByUserMenuId", query = "SELECT u FROM UserMenu u WHERE u.userMenuId = :userMenuId"),
    @NamedQuery(name = "UserMenu.findByUserId", query = "SELECT u FROM UserMenu u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserMenu.findByMenuId", query = "SELECT u FROM UserMenu u WHERE u.menuId = :menuId"),
    @NamedQuery(name = "UserMenu.findByVisible", query = "SELECT u FROM UserMenu u WHERE u.visible = :visible"),
    @NamedQuery(name = "UserMenu.findByModifiedDate", query = "SELECT u FROM UserMenu u WHERE u.modifiedDate = :modifiedDate")})
public class UserMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserMenuId")
    private Integer userMenuId;
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "MenuId")
    private Integer menuId;
    @Column(name = "Visible")
    private Boolean visible;
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public UserMenu() {
    }

    public UserMenu(Integer userMenuId) {
        this.userMenuId = userMenuId;
    }

    public Integer getUserMenuId() {
        return userMenuId;
    }

    public void setUserMenuId(Integer userMenuId) {
        this.userMenuId = userMenuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userMenuId != null ? userMenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserMenu)) {
            return false;
        }
        UserMenu other = (UserMenu) object;
        if ((this.userMenuId == null && other.userMenuId != null) || (this.userMenuId != null && !this.userMenuId.equals(other.userMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.primeadminbsb.models.UserMenu[ userMenuId=" + userMenuId + " ]";
    }

}

package com.blogspot.ofarukkurt.primeadminbsb.models;

import com.blogspot.ofarukkurt.primeadminbsb.enums.MenuType;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.envers.Audited;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 13/02/2017 09:19:27
 */
@Entity
@Table(name = "menu")
@Audited
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m ORDER BY m.menuName"),
    @NamedQuery(name = "Menu.findByMenuId", query = "SELECT m FROM Menu m WHERE m.menuId = :menuId"),
    @NamedQuery(name = "Menu.findByMenuName", query = "SELECT m FROM Menu m WHERE m.menuName LIKE :menuName ORDER BY m.menuName"),
    @NamedQuery(name = "Menu.findByTopMenuId", query = "SELECT m FROM Menu m WHERE m.topMenuId = :topMenuId"),
    @NamedQuery(name = "Menu.findByMenuType", query = "SELECT m FROM Menu m WHERE m.menuType = com.blogspot.ofarukkurt.primeadminbsb.enums.MenuType.M ORDER BY m.menuName"),
    @NamedQuery(name = "Menu.findByLink", query = "SELECT m FROM Menu m WHERE m.link = :link"),
    @NamedQuery(name = "Menu.findByIcon", query = "SELECT m FROM Menu m WHERE m.icon = :icon"),
    @NamedQuery(name = "Menu.findByIconColor", query = "SELECT m FROM Menu m WHERE m.iconColor = :iconColor"),
    @NamedQuery(name = "Menu.findByOrderNum", query = "SELECT m FROM Menu m WHERE m.orderNum = :orderNum"),
    @NamedQuery(name = "Menu.findByModifiedDate", query = "SELECT m FROM Menu m WHERE m.modifiedDate = :modifiedDate")})
public class Menu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MenuId")
    private Integer menuId;
    @Size(max = 45)
    @Column(name = "MenuName")
    @NotNull
    private String menuName;
    @Column(name = "TopMenuId")
    private Integer topMenuId;
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "MenuType")
    private MenuType menuType;
    @Size(max = 45)
    @Column(name = "Link")
    private String link;
    @Size(max = 45)
    @Column(name = "Icon")
    private String icon;
    @Size(max = 45)
    @Column(name = "IconColor")
    private String iconColor;
    @Column(name = "OrderNum")
    private Integer orderNum;

    public Menu() {
    }

    public Menu(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getTopMenuId() {
        return topMenuId;
    }

    public void setTopMenuId(Integer topMenuId) {
        this.topMenuId = topMenuId;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconColor() {
        return iconColor;
    }

    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.primeadminbsb.models.Menu[ menuId=" + menuId + " ]";
    }

}

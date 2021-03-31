package com.lambdaschool.foodtruck.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "menuitems")
public class MenuItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuitemid;

    @Column(unique = true)
    private String itemname;

    private String itemdescription;
    private long price;
    private String menuitemphotourl;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @ManyToMany(mappedBy = "menuItems")
    private Set<Truck> trucks = new HashSet<>();

    public MenuItems() {
    }

    public MenuItems(String itemname, String itemdescription, long price, User user, String menuitemphotourl) {
        this.itemname = itemname;
        this.itemdescription = itemdescription;
        this.price = price;
        this.user = user;
        this.menuitemphotourl = menuitemphotourl;
    }



    public String getMenuitemphotourl() {
        return menuitemphotourl;
    }

    public void setMenuitemphotourl(String menuitemphotourl) {
        this.menuitemphotourl = menuitemphotourl;
    }

    public Set<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(Set<Truck> trucks) {
        this.trucks = trucks;
    }

    public long getMenuitemid() {
        return menuitemid;
    }

    public void setMenuitemid(long menuitemid) {
        this.menuitemid = menuitemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

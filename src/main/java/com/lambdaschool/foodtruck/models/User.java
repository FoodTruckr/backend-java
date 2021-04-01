package com.lambdaschool.foodtruck.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;

    @Column(nullable = false)
    private String role;

    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private String email;

    @OneToMany
    private List<CustomerReview> customerReviews = new ArrayList<>();

    @OneToMany
    private Set<Truck> truck = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CuisineType> cuisineType = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItems> menuItems = new ArrayList<>();

    @ManyToMany()
    @JoinTable(name = "favoritetrucks", joinColumns = @JoinColumn(name = "userid"),inverseJoinColumns = @JoinColumn(name = "truckid"))
    private List<Truck> favTrucks = new ArrayList<>();

    public User() {
    }

    public User(String role, String username, String password, String email) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.email = email;
    }



    public List<CustomerReview> getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(List<CustomerReview> customerReviews) {
        this.customerReviews = customerReviews;
    }

    public Set<Truck> getTruck() {
        return truck;
    }

    public void setTruck(Set<Truck> truck) {
        this.truck = truck;
    }

    public Set<CuisineType> getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(Set<CuisineType> cuisineType) {
        this.cuisineType = cuisineType;
    }

    public List<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

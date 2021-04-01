package com.lambdaschool.foodtruck.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trucks")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long truckid;



    private String truckname;
    private long latitude;
    private long longitude;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private Date arrivaldate;
    private Time arrivaltime;
    private Date departuredate;
    private Time departuretime;
    private String truckphotourl;

    @ManyToOne
    private User user;

    @ManyToMany()
    @JoinTable(name = "truckmenu", joinColumns = @JoinColumn(name = "truckid"),inverseJoinColumns = @JoinColumn(name = "menuitemid"))
    private List<MenuItems> menuItems = new ArrayList<>();

    @ManyToMany()
    @JoinTable(name = "truckcuisine", joinColumns = @JoinColumn(name = "truckid"), inverseJoinColumns = @JoinColumn(name = "cuisinetypeid"))
    private List<CuisineType> cuisineTypes = new ArrayList<>();

    @OneToOne
    private CustomerReview customerReview;

    @ManyToMany(mappedBy = "favTrucks")
    private List<User> users = new ArrayList<>();

    public Truck() {
    }

    public Truck(long truckid, String truckname, long latitude, long longitude, String address, String city, String state, int zipcode, Date arrivaldate, Time arrivaltime, Date departuredate, Time departuretime, String truckphotourl, User user) {
        this.truckid = truckid;
        this.truckname = truckname;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.arrivaldate = arrivaldate;
        this.arrivaltime = arrivaltime;
        this.departuredate = departuredate;
        this.departuretime = departuretime;
        this.truckphotourl = truckphotourl;
        this.user = user;
    }

    public CustomerReview getCustomerReview() {
        return customerReview;
    }

    public void setCustomerReview(CustomerReview customerReview) {
        this.customerReview = customerReview;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<CuisineType> getCuisineTypes() {
        return cuisineTypes;
    }

    public void setCuisineTypes(List<CuisineType> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    public long getTruckid() {
        return truckid;
    }

    public void setTruckid(long truckid) {
        this.truckid = truckid;
    }

    public String getTruckname() {
        return truckname;
    }

    public void setTruckname(String truckname) {
        this.truckname = truckname;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Time getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Time arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    public Time getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Time departuretime) {
        this.departuretime = departuretime;
    }

    public String getTruckphotourl() {
        return truckphotourl;
    }

    public void setTruckphotourl(String truckphotourl) {
        this.truckphotourl = truckphotourl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }
}

package com.lambdaschool.foodtruck.models;

import javax.persistence.*;

@Entity
@Table(name = "customerreviews")
public class CustomerReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerreviewid;

    private long rating;
    private String customerreview;

    @ManyToOne
    private User user;

    @OneToOne
    private Truck truck;

    public CustomerReview() {
    }

    public CustomerReview(long rating, String customerreview, User user, Truck truck) {
        this.rating = rating;
        this.customerreview = customerreview;
        this.user = user;
        this.truck = truck;
    }



    public long getCustomerreviewid() {
        return customerreviewid;
    }

    public void setCustomerreviewid(long customerreviewid) {
        this.customerreviewid = customerreviewid;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getCustomerreview() {
        return customerreview;
    }

    public void setCustomerreview(String customerreview) {
        this.customerreview = customerreview;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
}

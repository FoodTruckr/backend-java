package com.lambdaschool.foodtruck.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cuisinetypes")
public class CuisineType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cuisinetypeid;

    private String cuisinetypename;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = true)
    private User user;


    @ManyToMany(mappedBy = "cuisineTypes")
    private Set<Truck> trucks = new HashSet<>();


    public CuisineType() {
    }

    public CuisineType(String cuisinetypename, User user) {
        this.cuisinetypename = cuisinetypename;
        this.user = user;

    }



    public Set<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(Set<Truck> trucks) {
        this.trucks = trucks;
    }

    public long getCuisinetypeid() {
        return cuisinetypeid;
    }

    public void setCuisinetypeid(long cuisinetypeid) {
        this.cuisinetypeid = cuisinetypeid;
    }

    public String getCuisinetypename() {
        return cuisinetypename;
    }

    public void setCuisinetypename(String cuisinetypename) {
        this.cuisinetypename = cuisinetypename;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package com.lambdaschool.foodtruck.models;

import javax.persistence.*;

@Entity
@Table(name = "cuisinetypes")
public class CuisineType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cuisinetypeid;

    private String cuisinetypename;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    public CuisineType() {
    }

    public CuisineType(String cuisinetypename, User user) {
        this.cuisinetypename = cuisinetypename;
        this.user = user;

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

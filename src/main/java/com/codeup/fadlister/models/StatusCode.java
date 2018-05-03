package com.codeup.fadlister.models;

import javax.persistence.*;

@Entity
@Table(name="status_codes")
public class StatusCode {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    // relationships...

    public StatusCode() {
    }

    public StatusCode(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

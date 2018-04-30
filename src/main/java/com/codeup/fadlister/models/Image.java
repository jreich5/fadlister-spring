package com.codeup.fadlister.models;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String path;

}

package com.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String price;
    private String image1;
    private String image2;
    private String image3;
    private String image4;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategory")
    private Category category;

    @Basic
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    private String create_user;

    @Basic
    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    private String update_user;

}

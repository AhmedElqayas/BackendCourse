package com.myorders.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "product_details")
@Getter
@Setter
@NoArgsConstructor
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private float price;
    @Column(name = "availability")
    private boolean availability;
    @OneToOne(mappedBy = "productDetails")
    private Product product;

}

package com.rest.rest_example.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String country;
    String city;
    String street;
    String zipCode;
    int phoneNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;
    /*
    JPA Annotations
    1: @OneToOne(@JoinColumn), @OneToMany, @ManyToOne(@JoinColumn), @ManyToMany(@JoinColumn)
    2: Fetch : FetchType.EAGER and FetchType.LAZY
    3: Cascade
     */

}

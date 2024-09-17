package com.juan.exam.shopping.restshopping.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    private Long id;
    private Long idProduct;
    @NotNull
    private Long idClient;
    @NotNull
    private int amount;
    private int countProduct;


    public Order() {

    }
}

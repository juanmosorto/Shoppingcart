package com.juan.exam.shopping.restshopping.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NaturalId
    @Column(unique = true)
    private String clientName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String adress;
    @NotNull

    public Client() {

    }
}

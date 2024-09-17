package com.juan.exam.shopping.restshopping.models.dtos;

import com.juan.exam.shopping.restshopping.models.entities.Client;
import com.juan.exam.shopping.restshopping.models.entities.Pay;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class OrderDetailDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProduct;
    private Long idPago;
    private Integer amount;
    private Long client;
}

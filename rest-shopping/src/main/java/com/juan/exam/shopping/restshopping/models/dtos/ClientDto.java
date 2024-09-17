package com.juan.exam.shopping.restshopping.models.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Data
public class ClientDto {

    private Long id;
    private String clientName;
    private String email;
    private String password;
    private String adress;


}

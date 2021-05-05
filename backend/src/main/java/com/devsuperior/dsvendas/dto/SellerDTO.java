package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.models.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}

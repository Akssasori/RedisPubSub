package com.broker.redis.dto;

import com.broker.redis.validations.annotations.ColorValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Integer id;
    private String name;
    private Integer qty;
    private Long price;

    @ColorValidation()
    private String colorName;
}

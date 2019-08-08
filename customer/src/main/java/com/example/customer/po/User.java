package com.example.customer.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @param :
 * @author : lindonglin
 * @Description :
 * @ate : 20:36  2019/8/8
 * @return :
 */
@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}

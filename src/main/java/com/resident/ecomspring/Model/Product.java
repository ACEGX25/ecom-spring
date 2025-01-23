package com.resident.ecomspring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id

    private int prodId;
    private String prodName;
    private String prodDesc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releasedate;
    private boolean available;
    private int quantity;
}

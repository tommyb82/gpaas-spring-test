package com.example.gpaas;

import java.math.BigDecimal;
import lombok.Value;

/**
 *
 */
@Value
public class Product {

  BigDecimal price;
  String name;
  String sku;

}

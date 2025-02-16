package com.scaler.yash.productservice13april.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product { // exactly a table a in your DB
    private Integer id;
    private String title;
    private String description;
    private String price;
    private String imageURL;
    private Category category;


    // private: called access_modifier
}



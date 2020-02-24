package com.order.system.product.service.models;

import com.order.system.product.service.entities.Product;

/**
 * @author Nasim Salmany
 */
public class ProductResponse {
    private Long id;
    private String name;
    private String description;

    public ProductResponse() {
    }

    public ProductResponse (Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

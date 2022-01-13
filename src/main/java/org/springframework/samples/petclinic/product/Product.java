package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends NamedEntity {
    @NotNull
    @Min(0)
    double price;
    
    ProductType productType;
}

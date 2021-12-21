package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @PrimaryKeyJoinColumn
    Integer id;

    @NotNull
    @Size(min = 3, max = 50)
    String name;

    @Min(0)
    @NotNull
    double price;

    @ManyToOne
    ProductType productType;
}

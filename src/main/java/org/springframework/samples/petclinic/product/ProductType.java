package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_types")
public class ProductType {
    @Id
    Integer id;
    @NotNull
    @Size(min = 3, max = 50)
    String name;
}

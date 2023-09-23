package br.com.makersweb.authapi.domain.product;

import br.com.makersweb.authapi.domain.product.dto.ProductRequest;
import br.com.makersweb.authapi.domain.product.dto.ProductResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author aaristides
 */
@Entity(name = "Product")
@Table(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private BigDecimal price;

    public Product(final ProductRequest data) {
        this.name = data.name();
        this.price = data.price();
    }

    public ProductResponse toAggregate() {
        return ProductResponse.from(this);
    }

}

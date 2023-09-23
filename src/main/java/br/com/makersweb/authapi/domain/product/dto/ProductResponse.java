package br.com.makersweb.authapi.domain.product.dto;

import br.com.makersweb.authapi.domain.product.Product;

import java.math.BigDecimal;

/**
 * @author aaristides
 * @param id
 * @param name
 * @param price
 */
public record ProductResponse(
        String id,
        String name,
        BigDecimal price
) {

    public static ProductResponse from(final Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }

}

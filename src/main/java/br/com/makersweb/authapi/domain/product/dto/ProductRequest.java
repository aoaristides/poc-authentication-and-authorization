package br.com.makersweb.authapi.domain.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * @author aaristides
 * @param name
 * @param price
 */
public record ProductRequest(
        @NotBlank String name,
        @NotNull BigDecimal price
) {
}

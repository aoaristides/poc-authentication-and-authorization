package br.com.makersweb.authapi.services.impl;

import br.com.makersweb.authapi.domain.product.Product;
import br.com.makersweb.authapi.domain.product.dto.ProductRequest;
import br.com.makersweb.authapi.domain.product.dto.ProductResponse;
import br.com.makersweb.authapi.repositories.ProductRepository;
import br.com.makersweb.authapi.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aaristides
 */
@Service
@AllArgsConstructor
@Slf4j
public class DefaultProductService implements ProductService {

    private final ProductRepository repository;

    @Override
    public ProductResponse create(final ProductRequest request) {
        log.info("Init method create product by name - {}", request.name());
        return this.repository.save(new Product(request)).toAggregate();
    }

    @Override
    public List<ProductResponse> getAll() {
        log.info("Init method getAll products.");
        final var products = this.repository.findAll()
                .stream()
                .map(ProductResponse::from)
                .toList();
        return products;
    }
}

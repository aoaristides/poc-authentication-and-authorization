package br.com.makersweb.authapi.controllers;

import br.com.makersweb.authapi.domain.product.dto.ProductRequest;
import br.com.makersweb.authapi.services.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author aaristides
 */
@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody @Valid ProductRequest request, UriComponentsBuilder uriBuilder) {
        final var product = this.productService.create(request);
        final var uri = uriBuilder.path("/{id}").buildAndExpand(product.id()).toUri();
        return ResponseEntity.created(uri).body(product);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(this.productService.getAll());
    }

}

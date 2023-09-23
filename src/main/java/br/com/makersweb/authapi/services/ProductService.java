package br.com.makersweb.authapi.services;

import br.com.makersweb.authapi.domain.product.dto.ProductRequest;
import br.com.makersweb.authapi.domain.product.dto.ProductResponse;

import java.util.List;

/**
 * @author aaristides
 */
public interface ProductService {

    ProductResponse create(final ProductRequest request);

    List<ProductResponse> getAll();

}

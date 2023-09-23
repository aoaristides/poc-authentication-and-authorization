package br.com.makersweb.authapi.repositories;

import br.com.makersweb.authapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aaristides
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}

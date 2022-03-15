package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.ProductProjection;
import uz.pdp.apppcmarket.projection.UserProjection;

@RepositoryRestResource(path = "product",
        excerptProjection = ProductProjection.class,
        collectionResourceRel = "list")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.CategoryProjection;
import uz.pdp.apppcmarket.projection.UserProjection;

@RepositoryRestResource(path = "category",
        excerptProjection = CategoryProjection.class,
        collectionResourceRel = "list")
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.UserProjection;

@RepositoryRestResource(path = "user",
        excerptProjection = UserProjection.class,
        collectionResourceRel = "list")
public interface UserRepository extends JpaRepository<User, Long> {
}

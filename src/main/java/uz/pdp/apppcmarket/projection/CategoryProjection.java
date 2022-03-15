package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.User;

import java.time.LocalDateTime;

@Projection(types = Category.class)
public interface CategoryProjection {

    Long getId();

    LocalDateTime getCreatedTime();

    LocalDateTime getUpdatedTime();

    String getName();
}

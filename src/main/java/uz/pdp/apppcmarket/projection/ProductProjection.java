package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Product;

import java.time.LocalDateTime;

@Projection(types = Product.class)
public interface ProductProjection {

    Long getId();

    LocalDateTime getCreatedTime();

    LocalDateTime getUpdatedTime();

    String getName();

    Double getPrice();

    String getWarranty();

    Category getCategory();


}

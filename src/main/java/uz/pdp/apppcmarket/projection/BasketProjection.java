package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Basket;

import java.time.LocalDateTime;

@Projection(types = Basket.class)
public interface BasketProjection {

    Long getId();

    LocalDateTime getCreatedTime();

    LocalDateTime getUpdatedTime();

    Double getAmount();

    String getUser();

    String getProducts();

}

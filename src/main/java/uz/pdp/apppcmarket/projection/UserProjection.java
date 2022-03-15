package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.User;

import java.time.LocalDateTime;

@Projection(types = User.class)
public interface UserProjection {

    Long getId();

    LocalDateTime getCreatedTime();

    LocalDateTime getUpdatedTime();

    String getName();

    String getAddress();

    String getPhone();

    String getEmail();


}

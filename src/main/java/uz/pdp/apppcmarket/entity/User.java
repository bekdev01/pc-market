package uz.pdp.apppcmarket.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.apppcmarket.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String address;

    @Column(unique = true,nullable = false)
    String phone;

    @Column(unique = true,nullable = false)
    String email;

}

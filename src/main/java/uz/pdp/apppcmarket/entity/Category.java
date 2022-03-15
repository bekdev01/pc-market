package uz.pdp.apppcmarket.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.apppcmarket.entity.base.BaseEntity;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category extends BaseEntity {
    String name;
}

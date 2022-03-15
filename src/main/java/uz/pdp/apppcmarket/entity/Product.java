package uz.pdp.apppcmarket.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.apppcmarket.entity.base.BaseEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name","category_id"}))
public class Product extends BaseEntity {
    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    Double price;

    @Column(nullable = false)
    String warranty;

    @ManyToOne
    Category category;
}

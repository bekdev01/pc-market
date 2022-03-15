package uz.pdp.apppcmarket.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.apppcmarket.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.swing.text.Document;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Basket extends BaseEntity {
    Double amount;

    @OneToOne
    User user;

    @ManyToMany
    List<Product> products;


}

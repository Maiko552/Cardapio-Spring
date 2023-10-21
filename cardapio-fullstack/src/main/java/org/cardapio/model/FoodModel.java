package org.cardapio.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cardapio.dto.FoodRequestDTO;

@Entity(name = "foods")
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String image;
    private Integer price;

    public FoodModel(FoodRequestDTO data){
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();

    }

    public Long getId() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public String getImage() {
        return null;
    }

    public Integer getPrice() {
        return null;
    }
}

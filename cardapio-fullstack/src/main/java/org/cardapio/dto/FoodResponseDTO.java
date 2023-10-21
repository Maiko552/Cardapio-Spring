package org.cardapio.dto;

import org.cardapio.model.FoodModel;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(FoodModel food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }

}

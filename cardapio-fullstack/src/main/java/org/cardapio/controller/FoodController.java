package org.cardapio.controller;

import org.cardapio.dto.FoodRequestDTO;
import org.cardapio.dto.FoodResponseDTO;
import org.cardapio.model.FoodModel;
import org.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/foods")
    public void saveFood(@RequestBody FoodRequestDTO data){
        FoodModel foodData = new FoodModel(data);
        repository.save(foodData);

    }
    @GetMapping("/foods")
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}

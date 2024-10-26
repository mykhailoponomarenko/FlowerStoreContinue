package ua.edu.ucu.apps.lab.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.flower.Flower;
import ua.edu.ucu.apps.lab.flower.FlowerColor;
import ua.edu.ucu.apps.lab.flower.FlowerType;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    
    @GetMapping("/flowers")
    
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(FlowerColor.RED, 10,0, FlowerType.CHAMOMILE)
        );

    }
}

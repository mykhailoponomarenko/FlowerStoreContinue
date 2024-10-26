package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;

@Getter
public enum FlowerColor {
    RED("#FF0000"), WHITE(""), YELLOW("");

    private String code;

    FlowerColor(String code) {
        this.code = code;
    }

}

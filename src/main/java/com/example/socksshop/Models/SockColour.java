package com.example.socksshop.Models;

public enum SockColour {
    BLACK("чёрный"),
    BLUE("синий"),
    BROWN("коричневый"),
    GREEN("зелёный"),
    GRAY("серый"),
    RAD("красный"),
    WHITE("белый"),
    YELLOW("жёлтый");

    private String colour;

    SockColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}

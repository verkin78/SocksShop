package com.example.socksshop.Models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.Objects;

@Data
@AllArgsConstructor
@NonNull
@NoArgsConstructor
public class Socks {

    private  SockColour colour;
    private  SockSize size;
    private  SockFabric cotton;
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socks socks = (Socks) o;
        return colour == socks.colour && size == socks.size && cotton == socks.cotton;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, size, cotton);
    }

    @Override
    public String toString() {
        return "Партия :" + "\n" +
                "Цвет - " + colour + colour.getColour() + "\n" +
                "Размер - " + size + size.getSize() + "\n" +
                "Процент хлопка - " + cotton.getCotton() + "\n" +
                "Количество пар на складе - " + quantity + "\n";
    }
}

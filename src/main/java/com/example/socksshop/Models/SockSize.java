package com.example.socksshop.Models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

public enum SockSize {
    S1(21),
    S2(23),
    S3(25),
    S4(27),
    S5(29),
    S6(31),
    S7(33),
    S8(35),
    S9(37),
    S10(39);

    private Integer size;

    SockSize(Integer size) {this.size = size;}

    public Integer getSize() {
        return size;
    }
}

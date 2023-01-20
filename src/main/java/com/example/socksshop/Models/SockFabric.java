package com.example.socksshop.Models;

public enum SockFabric {
    C1(0),
    C2(25),
    C3(33),
    C4(40),
    C5(55),
    C6(60),
    C7(75),
    C8(90),
    C9(100);
    private Integer cotton;

    SockFabric(Integer cotton) {this.cotton = cotton;}

    public Integer getCotton() {
        return cotton;
    }
}

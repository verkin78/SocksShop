package com.example.socksshop.Services;

import com.example.socksshop.Models.SockColour;
import com.example.socksshop.Models.SockFabric;
import com.example.socksshop.Models.SockSize;
import com.example.socksshop.Models.Socks;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface SocksService {

    @Nullable
    Socks addSocks(Socks sock);

    Integer getSocks(SockColour colour, SockSize size, SockFabric cotton);


    boolean putSocks(SockColour colour, SockSize size, SockFabric cotton, Integer i);

    boolean deleteSocks(Socks sock);
}

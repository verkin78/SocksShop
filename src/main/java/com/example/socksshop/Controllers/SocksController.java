package com.example.socksshop.Controllers;

import com.example.socksshop.Models.SockColour;
import com.example.socksshop.Models.SockFabric;
import com.example.socksshop.Models.SockSize;
import com.example.socksshop.Models.Socks;
import com.example.socksshop.services.SocksService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/socks")
@Tag(name = "Склад носков", description = "Операции со складом")
public class SocksController {

    private final SocksService socksService;

    public SocksController(SocksService socksService) {
        this.socksService = socksService;
    }

    @PostMapping("/add")
    @Operation(description = "Добавить партию на склад")
    @ApiResponse(responseCode = "200",
            description = "партия успешно добавлена")
    @ApiResponse(responseCode = "400",
            description = "параметры запроса отсутствуют или имеют некорректный формат;")
    @ApiResponse(responseCode = "500",
            description = "произошла ошибка, не зависящая от вызывающей стороны.")
    public ResponseEntity addSocks(@RequestBody Socks sock) {
        try {
            return ResponseEntity.ok(socksService.addSocks(sock));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/get")
    @Operation(description = "Посмотреть на складе количество партий носков")
    @ApiResponse(responseCode = "200",
            description = "Список партий носков на складе")
    @ApiResponse(responseCode = "400",
            description = "параметры запроса отсутствуют или имеют некорректный формат;")
    @ApiResponse(responseCode = "500",
            description = "произошла ошибка, не зависящая от вызывающей стороны.")
    public ResponseEntity getAllSocks(@RequestParam SockColour colour,
                                      @RequestParam SockSize size,
                                      @RequestParam SockFabric cotton) {
        return ResponseEntity.ok("Количество носков на складе - "+socksService.getSocks(colour,size,cotton).toString());
    }

    @DeleteMapping("/delete")
    @Operation(description = "Выбраковка товара")
    @ApiResponse(responseCode = "200",
            description = "Товар списан")
    @ApiResponse(responseCode = "400",
            description = "параметры запроса отсутствуют или имеют некорректный формат;")
    @ApiResponse(responseCode = "500",
            description = "произошла ошибка, не зависящая от вызывающей стороны.")
    public ResponseEntity delete(@RequestBody Socks sock) {
        return ResponseEntity.ok(socksService.deleteSocks(sock));
    }

    @PutMapping("/take")
    @Operation(description = "Забрать носки со склада")
    @ApiResponse(responseCode = "200",
            description = "Вы забрали носки")
    @ApiResponse(responseCode = "400",
            description = "параметры запроса отсутствуют или имеют некорректный формат;")
    @ApiResponse(responseCode = "500",
            description = "произошла ошибка, не зависящая от вызывающей стороны.")
    public ResponseEntity takeSocks(@RequestParam SockColour colour,
                                    @RequestParam SockSize size,
                                    @RequestParam SockFabric cotton,
                                    @RequestParam Integer integer) {
        return ResponseEntity.ok(socksService.putSocks(colour, size, cotton, integer));
    }
}

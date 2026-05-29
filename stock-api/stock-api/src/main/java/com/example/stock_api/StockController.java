package com.example.stock_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{symbol}")
    public ResponseEntity<StockResponse> getStock(@PathVariable String symbol) {
        try {
            StockResponse stock = stockService.getStock(symbol);
            return ResponseEntity.ok(stock);
        } catch (Exception e) {
            StockResponse error = new StockResponse();
            error.setMessage("查詢失敗：" + e.getMessage());
            return ResponseEntity.badRequest().body(error);
        }
    }

    @GetMapping("/history/{symbol}")
    public ResponseEntity<List<StockEntity>> getHistory(@PathVariable String symbol) {
        return ResponseEntity.ok(stockService.getHistory(symbol));
    }
}
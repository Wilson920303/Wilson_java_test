package com.example.stock_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private YahooApiClient yahooApiClient;

    @Autowired
    private StockRepository stockRepository;

    public StockResponse getStock(String symbol) throws Exception {

        StockResponse stock = yahooApiClient.fetchStock(symbol.toUpperCase());

        StockEntity entity = new StockEntity();
        entity.setSymbol(stock.getSymbol());
        entity.setPrice(stock.getPrice());
        entity.setDayHigh(stock.getDayHigh());
        entity.setDayLow(stock.getDayLow());
        entity.setVolume(stock.getVolume());
        entity.setQueryTime(stock.getQueryTime());
        stockRepository.save(entity);

        return stock;
    }

    public List<StockEntity> getHistory(String symbol) {
        return stockRepository.findBySymbolOrderByQueryTimeDesc(symbol.toUpperCase());
    }
}
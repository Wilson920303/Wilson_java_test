package com.example.stock_api;

import java.time.LocalDateTime;

public class StockResponse {
    private String symbol;
    private Double price;
    private Double dayHigh;
    private Double dayLow;
    private Long volume;
    private LocalDateTime queryTime;
    private String message;

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Double getDayHigh() { return dayHigh; }
    public void setDayHigh(Double dayHigh) { this.dayHigh = dayHigh; }

    public Double getDayLow() { return dayLow; }
    public void setDayLow(Double dayLow) { this.dayLow = dayLow; }

    public Long getVolume() { return volume; }
    public void setVolume(Long volume) { this.volume = volume; }

    public LocalDateTime getQueryTime() { return queryTime; }
    public void setQueryTime(LocalDateTime queryTime) { this.queryTime = queryTime; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
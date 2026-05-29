package com.example.stock_api;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_query_history")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private Double price;
    private Double dayHigh;
    private Double dayLow;
    private Long volume;
    private LocalDateTime queryTime;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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
}
package com.example.stock_api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, Long> {

    // 查詢某支股票的歷史紀錄
    List<StockEntity> findBySymbolOrderByQueryTimeDesc(String symbol);
}
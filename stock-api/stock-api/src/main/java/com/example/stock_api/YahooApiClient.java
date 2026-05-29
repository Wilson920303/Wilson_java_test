package com.example.stock_api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

@Component
public class YahooApiClient {

    public StockResponse fetchStock(String symbol) throws Exception {

        String url = "https://query1.finance.yahoo.com/v8/finance/chart/"
                   + symbol + "?interval=1d&range=1d";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("User-Agent", "Mozilla/5.0")
            .build();

        HttpResponse<String> response =
            client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject root = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject chart = root.getAsJsonObject("chart");

        if (chart.get("error") != null && !chart.get("error").isJsonNull()) {
            throw new RuntimeException("找不到股票代號：" + symbol);
        }

        JsonObject meta = chart
            .getAsJsonArray("result")
            .get(0).getAsJsonObject()
            .getAsJsonObject("meta");

        StockResponse stock = new StockResponse();
        stock.setSymbol(meta.get("symbol").getAsString());
        stock.setPrice(meta.get("regularMarketPrice").getAsDouble());
        stock.setDayHigh(meta.get("regularMarketDayHigh").getAsDouble());
        stock.setDayLow(meta.get("regularMarketDayLow").getAsDouble());
        stock.setVolume(meta.get("regularMarketVolume").getAsLong());
        stock.setQueryTime(LocalDateTime.now());

        return stock;
    }
}
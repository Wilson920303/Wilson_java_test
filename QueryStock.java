package finalreport;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class QueryStock {

	public static void main(String[] args) {

	    try (Scanner scanner = new Scanner(System.in)) {

	        System.out.println("===== 股票查詢系統 =====");
	        System.out.println("提示：台股請輸入代號加 .TW，例如 2330.TW");

	        while (true) {

	            System.out.print("請輸入股票代碼（輸入 Quit 離開）：");
	            String symbol = scanner.nextLine().trim().toUpperCase();

	            if (symbol.equals("QUIT")) {
	                System.out.println("感謝使用，再見！");
	                break;
	            }

	            if (symbol.isEmpty()) {
	                continue;
	            }

	            try {
	                String url = "https://query1.finance.yahoo.com/v8/finance/chart/"
	                           + symbol
	                           + "?interval=1d&range=1d";

	                HttpClient client = HttpClient.newHttpClient();
	                HttpRequest request = HttpRequest.newBuilder()
	                    .uri(URI.create(url))
	                    .header("User-Agent", "Mozilla/5.0")
	                    .build();

	                HttpResponse<String> response =
	                    client.send(request, HttpResponse.BodyHandlers.ofString());

	                String json = response.body();
	                JsonObject root = JsonParser.parseString(json).getAsJsonObject();

	                JsonObject chart = root.getAsJsonObject("chart");
	                if (chart.get("error") != null && !chart.get("error").isJsonNull()) {
	                    System.out.println("查詢失敗：找不到股票代號 " + symbol);
	                    continue; 
	                }

	                JsonObject meta = chart
	                    .getAsJsonArray("result")
	                    .get(0).getAsJsonObject()
	                    .getAsJsonObject("meta");

	                double price = meta.get("regularMarketPrice").getAsDouble();

	                System.out.println("\n===== 股票資訊 =====");
	                System.out.println("股票代號：" + meta.get("symbol").getAsString());
	                System.out.printf ("現　　價：%.2f%n", price);
	                System.out.printf ("今日最高：%.2f%n", meta.get("regularMarketDayHigh").getAsDouble());
	                System.out.printf ("今日最低：%.2f%n", meta.get("regularMarketDayLow").getAsDouble());
	                System.out.println("成交量　：" + meta.get("regularMarketVolume").getAsLong());


	            } catch (Exception e) {
	                System.out.println("查詢失敗：" + e.getMessage());
	              
	            }

	        } 
	    }
	}
}
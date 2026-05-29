package tw.leonchen.common;

import java.io.*;
import java.util.*;

public class TextLoggerAndAnalyzer_410170196 {

    public static void main(String[] args) {

        File dir = new File("c:/temp/log");
        File file = new File("c:/temp/log/input.txt");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
        ) {

            System.out.println("請輸入文字，輸入 exit 結束：");

            String line;
            while ((line = br.readLine()) != null) {

                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }

                System.out.println("data=" + line);
                bw.write(line);
                bw.newLine();
                bw.flush(); // 立即寫入
            }

        } catch (IOException e) {
            System.out.println("輸入或寫入發生錯誤：" + e);
        }
       
        int lineCount = 0;
        int charCount = 0;
        HashMap<String, Integer> wordMap = new HashMap<>();

        try (
            FileReader fr = new FileReader(file);
            BufferedReader brFile = new BufferedReader(fr);
        ) {

            String line;
            while ((line = brFile.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    if (word.length() == 0) continue;
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("讀取檔案發生錯誤：" + e);
        }

       
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordMap.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\n===== 分析結果 =====");
        System.out.println("總行數：" + lineCount);
        System.out.println("總字元數：" + charCount);
        System.out.println("Top 5 單字：");

        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if (count == 5) break;
        }
    }
}

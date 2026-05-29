package tw.leonchen.io;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestFileBufferedCharIOEx1 {
    public static void main(String[] args) throws IOException {

        FileReader fr1 = new FileReader("C:\\temp\\info\\123.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        String data;
        while ((data = br1.readLine()) != null) {
            System.out.print(data + " ");
        }

        br1.close();
        fr1.close();
    }
}

// 本程式利用 BufferedReader 搭配 FileReader，以逐行方式讀取文字檔內容並輸出，提高讀取效能。
// BufferedReader類別: 使用緩衝區以 char 的方式讀取資料的類別

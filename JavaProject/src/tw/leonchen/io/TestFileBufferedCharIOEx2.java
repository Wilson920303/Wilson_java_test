package tw.leonchen.io;

import java.io.*;

public class TestFileBufferedCharIOEx2 {

    public static void main(String[] args) throws IOException {

        FileReader fr1 = new FileReader("C:\\temp\\info\\123.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        FileWriter fw1 = new FileWriter("C:\\temp\\info\\456.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);

        String data;
        while ((data = br1.readLine()) != null) {
            System.out.println(data);   // 印出
            bw1.write(data);            // 寫入檔案
            bw1.newLine();              // 換行（很重要）
        }

        bw1.close();
        fw1.close();
        br1.close();
        fr1.close();
    }
}


// 本程式使用 BufferedReader 與 BufferedWriter 搭配字元串流，以逐行方式讀取文字檔並寫入另一文字檔，提高檔案處理效能。
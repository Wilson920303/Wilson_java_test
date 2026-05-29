package tw.leonchen.io.inputstreamreader;

import java.io.*;

public class TestCharIOOnlyWrite {

    public static void main(String[] args) throws IOException {

        // 鍵盤輸入（Byte → Char）【這個無法避免】
        BufferedReader br1 =
            new BufferedReader(new InputStreamReader(System.in));

        // 檔案輸出（純 Char 串流）
        BufferedWriter bw1 =
            new BufferedWriter(new FileWriter("c:/temp/info/destination2.txt"));

        String data;

        while ((data = br1.readLine()) != null) {
            System.out.println("data=" + data);
            bw1.write(data);
            bw1.newLine();   // 換行
        }

        // 關閉資源
        bw1.close();
        br1.close();
    }
}

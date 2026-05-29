package tw.leonchen.io.inputstreamreader;

import java.io.*;

public class TestByteConvertCharIOEx2 {

    public static void main(String[] args) throws IOException {

        // 鍵盤輸入（Byte → Char）
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);

        // 檔案輸出（Char → Byte）
        FileOutputStream fos1 = new FileOutputStream("c:/temp/info/destination.txt");
        OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
        BufferedWriter bw1 = new BufferedWriter(osw1);

        String data;

        while ((data = br1.readLine()) != null) {
            System.out.println("data=" + data);
            bw1.write(data);
            bw1.newLine();   // 換行（重要）
        }

        // 關閉資源（由外到內）
        bw1.close();
        osw1.close();
        fos1.close();
        br1.close();
        isr1.close();
    }
}

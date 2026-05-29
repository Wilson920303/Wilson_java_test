package tw.leonchen.io.inputstreamreader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestByteConvertCharIOEx1{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		String data;
		while((data=br1.readLine())!=null){
			System.out.println("data=" + data);
		}
		br1.close();
		isr1.close();
    }
}


// 將鍵盤輸入的位元組資料轉成字元資料，並以逐行方式讀取使用者輸入
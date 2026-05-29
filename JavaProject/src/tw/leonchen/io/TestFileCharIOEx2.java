package tw.leonchen.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharIOEx2{
	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:\\temp\\info\\123.txt");
		FileWriter fw1 = new FileWriter ("C:\\temp\\info\\456.txt");
		int data;
		while ((data = fr1.read()) != -1){
			System.out.print(data + " ");
			fw1.write(data);
		}
		fw1.close();
		fr1.close();
	}
}

// 以「字元串流」方式讀取文字檔，並將內容寫入另一個文字檔（文字檔複製）
// 用字元(char)複製檔案
package tw.leonchen.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class TestFileByteIOEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("C:\\temp\\info\\123.txt");
		FileOutputStream fos1 = new FileOutputStream("C:\\temp\\info\\456.txt");
		int data;
		while ((data = fis1.read()) != -1) {
			System.out.print(data + " ");
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
	}
}


//檔案內容的讀取與備份（複製），用位元組(byte)複製檔案

//| 類別             | 功能       |
//| -----------------| -------- |
//| FileInputStream  | 讀取位元組    |
//| FileOutputStream | 寫入位元組    |
//| read()           | 讀一個 byte |
//| write(int)       | 寫一個 byte |
//| -1               | 檔案結尾     |

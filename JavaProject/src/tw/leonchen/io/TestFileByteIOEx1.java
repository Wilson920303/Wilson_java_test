package tw.leonchen.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileByteIOEx1 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis1 = new FileInputStream("C:\\temp\\info\\123.txt");
		int data;
		while((data=fis1.read()) != -1) {
			System.out.print(data + " ");
		}
		fis1.close();
	}
}

//此程式利用 FileInputStream 以位元組方式讀取檔案內容，並逐一將每個位元組的數值印出，直到讀取完畢。
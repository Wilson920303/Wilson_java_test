package tw.leonchen.io;

import java.io.File;

public class TestFileEx1 {

	public static void main(String[] args) {
		File file1 = new File("c:/temp/test/hello.txt");
		
		if(file1.exists()) {
			System.out.println("Name:" + file1.getName());
			System.out.println("Length:" + file1.length() + " bytes");
			System.out.println("Parent:" + file1.getParent());
			System.out.println("Path:" + file1.getPath());
		}else {
			System.out.println("File Not Found");
		}

	}

}

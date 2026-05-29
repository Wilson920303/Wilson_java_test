package tw.leonchen.io;

import java.io.File;

public class TestFileEx2 {

	public static void main(String[] args) {
		File file2 = new File("c:/temp/info/");
		
		if(file2.exists()) {
			System.out.println("Directory Found");
		}else {
			System.out.println("Directory Not Found");
			
			boolean result = file2.mkdirs();
			System.out.println("Directoy Created Status:" + result);
		}

	}

}

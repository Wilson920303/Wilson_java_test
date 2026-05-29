package tw.leonchen.io;

import java.io.FileReader;
import java.io.IOException;

public class TestFileCharIOEx1 {

    public static void main(String[] args) throws IOException {

        FileReader fr1 = new FileReader("C:\\temp\\info\\123.txt");

        int data;
        while ((data = fr1.read()) != -1) {
            System.out.print(data + " ");
        }

        fr1.close();
    }
}

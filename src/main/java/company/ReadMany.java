package company;

import company.ReadTest;

import java.io.File;
import java.io.IOException;

public class ReadMany {
    public static void main(String[] args) throws IOException {
        File folder = new File("D:/Du_an_on_thi/txt/");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                String name = file.getName().substring(0,file.getName().length()-4);
                System.out.println(name);
                ReadTest.tesToAll(name);
            }
        }
    }
}

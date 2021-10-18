package company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Whitelist;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WriteTest {
    public static void stringToTxtFile(String str,String filename,String path){

        String pathWrite = path + filename + ".txt";
        try {
            File myObj = new File(pathWrite);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(pathWrite);
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static String html2text(String toString) {
        String result = toString.replaceAll("\\<.*?\\>", "\n");
        String previousResult = "";
        while(!previousResult.equals(result)){
            previousResult = result;
            result = result.replaceAll("\n\n","\n");
        }
        return result;
    }

    public static void correctImgLink(String pathname){
        String text="",title;
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.startsWith("imageLink:"))
                    data=data.substring(0,data.indexOf("\"",12)+1);
                text=text+data+"\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter(pathname);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeTest(String filename,String path,String url) throws IOException {
        URL oracle = new URL(url);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        String inputLine;
        String html="";
        while ((inputLine = in.readLine()) != null)
            html=html+inputLine;
        in.close();
        html = html.replace("<img src=","<img src>imageLink: ");
        html = "<" + html.substring(html.indexOf("role=\"list\""));
        String txt = html2text(html);
        System.out.println(txt);
        txt = txt.substring(txt.indexOf("&nbsp;"));
        txt = txt.substring(0,txt.indexOf("Nội dung này không phải do Google tạo ra hay xác nhận"));
//        System.out.println(txt);
        stringToTxtFile(txt,filename,path);
        correctImgLink(path+filename+".txt");
    }

    public static void main(String[] args) throws IOException {
        String path = "D:/Du_an_on_thi/txt/";
        String readname = "phan4_htttql";

        String url = "https://docs.google.com/forms/d/e/1FAIpQLSekhCcQbpoI_VW3iO5x_uQy82aZct64VEbzSYgAHlIsrCZb5Q/viewscore?viewscore=AE0zAgBaKdrvXgrQRK6IM2Ajk_H7G9LAfmkVEeNOG8uuuBGyf0fV-HSG5ZAQi63_SUg27Ug";
        writeTest(readname,path,url);
    }
}

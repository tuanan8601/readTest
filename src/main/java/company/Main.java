package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static String escapeQuotes(String str,String es)
    {
        String s = "";
        String[] txt = str.split(es);
        for (int i = 0; i < txt.length-1; i++) {
            s = s + txt[i] +"\\"+"\"";
        }
        s=s+txt[txt.length-1];
        return s;
    }

    public static void deletePage(String pathname){
        String text="",title;
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data=data.trim();
                if(!data.startsWith("-------")&&!data.isEmpty()){
                    title = data.split("\\.")[0];
                    if(isNumeric(title) || data.startsWith("A.") || data.startsWith("B.") || data.startsWith("C.") || data.startsWith("D.") ||data.startsWith("→"))
                        text=text+"\n"+data;
                    else text=text+data;
                }
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

    public static void questionToJSON(String pathname,String pathnameWrite){
        String[] str_arr;
        String all_text = "[\n",txt,title;
        int i=0;
        String test;
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                txt = data.trim();
                txt = escapeQuotes(txt, "”");
                txt = escapeQuotes(txt, "“");

                if (txt.isEmpty() || txt.startsWith("----")) continue;
                else {
                    title = txt.split("\\.")[0];
                    if (isNumeric(title) && (i > 0)) {
                        all_text = all_text + "\"";
                        all_text = all_text + "\n]\n},\n";
                    }
                    if (isNumeric(title)) {
                        all_text = all_text + "\n{\"number\":" + title + ", \n\"title\": ";
                        all_text = all_text + "\"";
                        all_text = all_text + " " + txt;
                        i++;
                    }
                    if (txt.startsWith("A.")) {
                        all_text = all_text + "\"," + "\n\"answer\":[\n";
                    }
                    if (txt.startsWith("A.") || txt.startsWith("B.") || txt.startsWith("C.") || txt.startsWith("D.") || txt.startsWith("→")) {
                        if (!txt.startsWith("A.")) all_text = all_text + "\"," + "\n";
                        if(!txt.startsWith("→")) all_text = all_text + " \"" + txt;
                        else all_text = all_text + " \"correct_answer\": [ \n\"" + txt;
                    }
                }
            }
            all_text = all_text + "\"" + "\n]\n}" + "\n\n]";
            System.out.println(all_text);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj = new File(pathnameWrite);
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
            FileWriter myWriter = new FileWriter(pathnameWrite);
            myWriter.write(all_text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String pathnameRead = "D:/Du_an_on_thi/tn_test.txt";
        String pathnameWrite = "D:/Du_an_on_thi/tn_json.txt";
        deletePage(pathnameRead);
        questionToJSON(pathnameRead,pathnameWrite);
    }

}

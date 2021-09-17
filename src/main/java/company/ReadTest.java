package company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import company.entity.Answer;
import company.entity.ObjectiveTest;
import company.entity.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTest {
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean isAnswer(String str){
        return !isNumeric(str.substring(0,1))&&str.charAt(1)=='.';
    }

    public static void deletePage(String pathname){
        String text="",title;
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data.replace(" ","");
                data.replace("&nbsp;","");
                data=data.trim();
                if(!data.startsWith("0/")&&!data.startsWith("1/")&&!data.isEmpty()&&
                        !data.equals(" ")&&!data.equals("&nbsp;")&&!data.equals("Không đúng")&&
                        !data.equals("Không có câu trả lời đúng")&&!data.equals("···")&&
                        !data.equals("/1")) text=text+"\n"+data;
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

    public static void correctAnswer(String pathname,String pathCopy){
        String text="",before="";
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.equals("Chính xác"))
                    text=text+"\n"+"Câu trả lời đúng"+"\n"+before;
                else text=text+"\n"+data;
                before=data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//        System.out.println(text);
        try {
            FileWriter myWriter = new FileWriter(pathname);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj = new File(pathCopy);
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
            FileWriter myWriter = new FileWriter(pathCopy);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void getCorrectAnswer(String pathname,String pathCorrect){
        String text="",before="";
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.isEmpty()) continue;
                if(data.equals("Câu trả lời đúng")) text=text+"\n"+data+"\n"+myReader.nextLine()+"\n";
                else if(!data.startsWith("0/")&&!data.startsWith("1/")
                &&!isAnswer(data))
                    text=text+"\n"+data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//        System.out.println(text);

        try {
            File myObj = new File(pathCorrect);
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
            FileWriter myWriter = new FileWriter(pathCorrect);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static List<Question> readTest(String pathname){
        List<Question> questions = new ArrayList<>();
        Question question = new Question();
        int i=0;
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data=data.trim();
                if(data.isEmpty()) continue;
                if(!isAnswer(data)&&!data.equals("Câu trả lời đúng")&&!data.equals("Phản hồi")&&!data.startsWith("imageLink: ")){
                    if(i>0){
                        System.out.println(question);
                        questions.add(question);
                    }
                    i++;
//                    System.out.println(i+". tt_ "+data);
                    question = new Question();
                    question.setTitle(data);
                    System.out.println();
                }
                else if(data.equals("Câu trả lời đúng")){
//                    System.out.println(i+". ctld_str_ "+data);
                    data = myReader.nextLine();
                    data=data.trim();
//                    System.out.println(i+". ctld_ "+data);
                    question.setSolution(data);
                    question.setSolutionHead(data.charAt(0));
                }
                else if(data.equals("Phản hồi")){
//                    System.out.println(i+". ctld_str_ "+data);
                    data = myReader.nextLine();
                    data=data.trim();
//                    System.out.println(i+". ctld_ "+data);
                    question.setFeedback(data);
                }
                else if(data.startsWith("imageLink: ")){
                    String imgLink = data.substring(data.indexOf("\"")+1);
                    imgLink = imgLink.substring(0,imgLink.indexOf("\""));
                    question.setImage(imgLink);
                }
                else if(isAnswer(data)){
//                    System.out.println(i+". as_ "+data);
                    System.out.println(data.substring(0,1));
                    Answer answer = new Answer();
                    answer.setAnswer(data);
                    answer.setAnswerHead(data.charAt(0));
                    question.getAnswers().add(answer);
                }
            }
            if(!question.equals(null)){
                System.out.println(question);
                questions.add(question);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return questions;
    }

    public static void questionToJavaObject(List<Question> questions,String pathWrite){
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
            for (Question question : questions) {
                myWriter.write(question.toString()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void objectJavaToJSON(List<Question> questions,String pathJSON){
        try {
            File myObj = new File(pathJSON);
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
            FileWriter myWriter = new FileWriter(pathJSON);
            int i=0;
            myWriter.write("[");
            for (Question question:questions) {
                ObjectMapper mapper = new ObjectMapper();
                try {
                    if(i>0) myWriter.write(",");
                    String json = mapper.writeValueAsString(question);
                    myWriter.write("\n"+json);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                i++;
            }
            myWriter.write("\n]");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void objectiveTestFullJSON(ObjectiveTest objectiveTest, String pathJSON_full){
        try {
            File myObj = new File(pathJSON_full);
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
            FileWriter myWriter = new FileWriter(pathJSON_full);
            ObjectMapper mapper = new ObjectMapper();
            try {
                String json = mapper.writeValueAsString(objectiveTest);
                myWriter.write(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = "D:/Du_an_on_thi/txt/";
        String readname = "tong_hop_cnxhkh_2";

//        String url = "https://docs.google.com/forms/d/e/1FAIpQLSfidkTQuor7awH8wpn65c9hPbRZ2_KDOmUv1B3btKtecQRpMw/viewscore?viewscore=AE0zAgBkjCPLLwNVIbNxQI8TykqJUNN8qyvSquuhzNZbVg9XgbNrLq6aACCBd6NSSAlk9sU";
//        WriteTest.writeTest(readname,path,url);

        String correctname = readname + "_correct";
        String writename = readname + "_object";
        String JSONname = readname + "_json";
        String pathRead = path+readname+".txt";
        String pathCopy = path+readname+"/"+readname+".txt";
        String pathCorrect = path+readname+"/"+correctname+".txt";
        String pathWrite = path+readname+"/"+writename+".txt";
        String pathJSON = path+readname+"/"+JSONname+".txt";
        String pathJSON_full = path+readname+"/"+JSONname+"_full.txt";

        File file = new File(path+readname);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Thư mục đã được tạo!");
            } else {
                System.out.println("Có lỗi xảy ra!");
            }
        }
        else System.out.println("Thư mục đã tồn tại");

        ObjectiveTest objectiveTest = new ObjectiveTest();
        objectiveTest.setTestName(readname);

        deletePage(pathRead);
        correctAnswer(pathRead,pathCopy);
        getCorrectAnswer(pathRead,pathCorrect);

        List<Question> questionList = readTest(pathRead);
        objectiveTest.setQuestions(questionList);

        System.out.println(objectiveTest);
        objectiveTestFullJSON(objectiveTest,pathJSON_full);

        questionToJavaObject(questionList,pathWrite);
        objectJavaToJSON(questionList,pathJSON);
    }
}

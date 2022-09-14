package company.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class Question {
    int qid;
    String title;
    List<Answer> answers = new ArrayList<>();
    String solution;
    char solutionHead;
    String feedback;
    String image;
}

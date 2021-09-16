package company.entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class Answer {
    String answer;
    char answerHead;
}

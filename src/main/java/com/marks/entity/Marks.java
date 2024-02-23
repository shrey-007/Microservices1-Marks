package com.marks.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("marks")
public class Marks {
    @Id
    private String marksId;
    private String userId;
    private String subjectId;
    private  int mark;
    private char grade;
}


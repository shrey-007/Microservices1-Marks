package com.marks.service;

import com.marks.entity.Marks;

import java.util.List;

public interface MarksService {

    Marks createMark(Marks marks);

    List<Marks> getMarks();

    List<Marks> getMarksByUserId(String userId);

    List<Marks> getMarksBySubjectId(String subjectId);

}

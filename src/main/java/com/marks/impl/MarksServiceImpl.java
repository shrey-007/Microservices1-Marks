package com.marks.impl;

import com.marks.entity.Marks;
import com.marks.repository.MarksRepository;
import com.marks.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksServiceImpl implements MarksService {
    @Autowired
    MarksRepository marksRepository;

    @Override
    public Marks createMark(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public List<Marks> getMarks() {
        return marksRepository.findAll();
    }

    @Override
    public List<Marks> getMarksByUserId(String userId) {
        return marksRepository.findByUserId(userId);
    }

    @Override
    public List<Marks> getMarksBySubjectId(String subjectId) {
        return marksRepository.findBySubjectId(subjectId);
    }
}

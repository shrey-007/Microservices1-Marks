package com.marks.repository;

import com.marks.entity.Marks;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarksRepository extends MongoRepository<Marks,String> {

    List<Marks> findByUserId(String userId);
    List<Marks> findBySubjectId(String subjectId);
}

package com.marks.controller;

import com.marks.entity.Marks;
import com.marks.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/marks")
public class MarksController {
    @Autowired
    private MarksService marksService;

    @PostMapping
    public ResponseEntity<Marks> createMarks(@RequestBody Marks marks){

        return ResponseEntity.status(HttpStatus.CREATED).body(marksService.createMark(marks));
    }
    @GetMapping
    public ResponseEntity<List<Marks>> getMarks(){
        return ResponseEntity.ok(marksService.getMarks());
    }
    @GetMapping("/student/{userId}")
    public ResponseEntity<List<Marks>> getMarksByUserId(@PathVariable String userId){
        return ResponseEntity.ok(marksService.getMarksByUserId(userId));
    }
    @GetMapping("/subject/{subjectId}")
    public ResponseEntity<List<Marks>> getMarksBySid(@PathVariable String subjectId){
        return ResponseEntity.ok(marksService.getMarksBySubjectId(subjectId));
    }
}

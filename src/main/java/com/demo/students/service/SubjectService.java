package com.demo.students.service;

import com.demo.students.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface SubjectService {
   // SubjectDTO createSubject();
    Set<SubjectDTO> getSubjects();
    /**SubjectDTO getSubject();
    SubjectDTO updateSubject();
    void deleteSubject();**/
}

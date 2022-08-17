package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.module.Subjects;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/subjects")
@RestController
public class SubjectsRestController {
    @Autowired
    SubjectsServiceImpl service;

    @RequestMapping("/")
    public List<Subjects> showAll() {
        return service.getAll();
    }
}
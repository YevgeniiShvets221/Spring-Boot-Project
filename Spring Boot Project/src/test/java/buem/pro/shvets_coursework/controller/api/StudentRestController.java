package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
public class StudentRestController {
    @Autowired
    StudentServiceImpl service;

    @RequestMapping("/")
    public List<Student> showAll(){
        return service.getAll();
    }
}

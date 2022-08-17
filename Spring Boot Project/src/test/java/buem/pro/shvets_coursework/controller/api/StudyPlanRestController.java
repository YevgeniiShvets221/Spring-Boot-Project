package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.service.studyPlan.impls.StudyPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/studyPlans")
@RestController
public class StudyPlanRestController {
    @Autowired
    StudyPlanServiceImpl service;

    @RequestMapping("/")
    public List<StudyPlan> showAll() {
        return service.getAll();
    }
}


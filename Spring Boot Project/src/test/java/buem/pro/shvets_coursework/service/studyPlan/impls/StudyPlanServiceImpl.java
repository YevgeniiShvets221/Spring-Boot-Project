package buem.pro.shvets_coursework.service.studyPlan.impls;

import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.module.Subjects;
import buem.pro.shvets_coursework.service.studyPlan.interfaces.IStudyPlanService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class StudyPlanServiceImpl implements IStudyPlanService {
    private LocalDateTime now = LocalDateTime.now();
    private List <StudyPlan> studyPlans = List.of(
            new StudyPlan("2","3","1",now,now),
            new StudyPlan("5","2","2",now,now),
            new StudyPlan("4","4","3",now,now),
            new StudyPlan("1","5","4",now,now),
            new StudyPlan("3","1","5",now,now));


    @Override
    public StudyPlan create(StudyPlan studyPlan) {
        return null;
    }

    @Override
    public StudyPlan update(StudyPlan studyPlan) {
        return null;
    }

    @Override
    public StudyPlan get(String id) {
        return null;
    }

    @Override
    public StudyPlan delete(String id) {
        return null;
    }

    @Override
    public List<StudyPlan> getAll() {

        return this.studyPlans;
    }
}

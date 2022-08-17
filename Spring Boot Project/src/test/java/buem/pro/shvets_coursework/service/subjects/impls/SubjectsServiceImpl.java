package buem.pro.shvets_coursework.service.subjects.impls;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.module.Subjects;
import buem.pro.shvets_coursework.service.subjects.interfaces.ISubjectsService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class SubjectsServiceImpl implements ISubjectsService {
    private LocalDateTime now = LocalDateTime.now();
    private List <Subjects> subjects = List.of(
          new Subjects( "1","WEB-design",
                  "60","45","30",now,now),
            new Subjects( "2","Artificial Intelligence",
                    "75","50","35",now,now),
            new Subjects( "3","Numerical methods",
                    "45","30","15",now,now),
            new Subjects( "4","Modern Databases",
                    "45","45","30",now,now),
            new Subjects( "5","Theory of algorithms",
                    "40","20","20",now,now));


    @Override
    public Subjects create(Subjects subjects) {
        return null;
    }

    @Override
    public Subjects update(Subjects subjects) {
        return null;
    }

    @Override
    public Subjects get(String id) {
        return null;
    }

    @Override
    public Subjects delete(String id) {
        return null;
    }

    @Override
    public List<Subjects> getAll() {

        return this.subjects;
    }
}

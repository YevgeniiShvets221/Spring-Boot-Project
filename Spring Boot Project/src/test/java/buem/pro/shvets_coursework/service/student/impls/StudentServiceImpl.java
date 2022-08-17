package buem.pro.shvets_coursework.service.student.impls;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.service.student.interfaces.IStudentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    private LocalDateTime now = LocalDateTime.now();
    private List <Student> students = List.of(
            new Student("1","Shvets","Yevhenii",
            "Valeriyovich", "Shevchenko street",
            "0673390600", now,now),
            new Student("2","Pavlov","Petro",
                        "Maksymovych", "Segedskaya street",
                        "0673485732", now,now),
            new Student("3","Potapova","Alyona",
                    "Oleksandrivna", "Bocharova street",
                    "0502345824", now,now),
            new Student("4","Panova","Hanna",
                    "Olehivna", "Pushkina avenue",
                    "0934121190", now,now),
            new Student("5","Avanesyan","Karim",
                    "Hrantovich", "Kamanina street",
                    "0934852340", now,now));

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student get(String id) {
        return null;
    }

    @Override
    public Student delete(String id) {
        return null;
    }

    @Override
    public List<Student> getAll() {

        return this.students;
    }
}

import models.Statistics;
import utils.JsonUtil;
import utils.StatisticsUtil;
import utils.Util;
import xlsx.XlsxReader;
import enums.EStudentComparator;
import enums.EUniversityComparator;
import models.Student;
import models.University;
import comparator.*;
import xlsx.XlsxWriter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = XlsxReader.readXlsxUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Util.getUniversityComparator(EUniversityComparator.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.universityListToJson(universities);
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonUniversityList(universitiesJson);
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {String universityJson = JsonUtil.universityToJson(university);
            System.out.println(universityJson);
        University universityFromJson = JsonUtil.jsonUniversity(universityJson);
            System.out.println(universityFromJson);
        });

        List<Student> students = XlsxReader.readXlsxStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Util.getStudentComparator(EStudentComparator.AVG_EXAM_SCORE);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.studentListJson(students);
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonStudentList(studentsJson);
        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {String studentJson = JsonUtil.studentToJson(student);
            System.out.println(studentJson);
        Student studentFromJson = JsonUtil.jsonStudent(studentJson);
            System.out.println(studentFromJson);
        });
        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsxWriter.writeXlsxStatistics(statisticsList, "statistics.xlsx");
    }
}

import Utils.Utils;
import Xlsx.reader.XlsxReader;
import enums.EStudentComparator;
import enums.EUniversityComparator;
import models.Student;
import models.University;
import comparator.*;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = XlsxReader.readXlsxUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Utils.getUniversityComparator(EUniversityComparator.YEAR_OF_FOUNDATION);
        universities.stream().sorted(universityComparator).forEach(System.out::println);

        List<Student> students = XlsxReader.readXlsxStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Utils.getStudentComparator(EStudentComparator.AVG_EXAM_SCORE);
        students.stream().sorted(studentComparator).forEach(System.out::println);

    }
}

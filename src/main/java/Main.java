import enum_package.StudyProfile;
import model_class.Student;
import model_class.University;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAvgExamScore(4);
        student.setFullName("Gor Igor Vladimirovich");
        student.setCurrentCourseNumber(2);
        student.setUniversityId("0864");
        System.out.println(student);

        University university = new University();
        university.setId("0864");
        university.setFullName("Moscow technological institute");
        university.setShortName("MTI");
        university.setYearOfFoundation(1997);
        university.setMainProfile(StudyProfile.MATHEMATICS);
        System.out.println(university);
    }
}

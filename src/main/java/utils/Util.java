package utils;

import comparator.*;
import enums.EStudentComparator;
import enums.EUniversityComparator;

public class Util {
     private Util() {
    }
    public static StudentComparator getStudentComparator(EStudentComparator studentComparator) {
        switch (studentComparator) {
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComporator();
            case CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseNumberComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default: return new StudentFullNameComparator();
        }
    }

        public static UniversityComparator getUniversityComparator(EUniversityComparator universityComparator){
        switch (universityComparator){
            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            case STUDY_PROFILE:
                return new UniversityStudyProfileComparator();
            default:
                return new UniversityFullNameComparator();

        }
    }
}


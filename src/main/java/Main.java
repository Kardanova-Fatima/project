import io.JsonWriter;
import io.XmlWriter;
import models.FullInfo;
import models.Statistics;
import utils.StatisticsUtil;
import utils.Util;
import io.XlsxReader;
import enums.EStudentComparator;
import enums.EUniversityComparator;
import models.Student;
import models.University;
import comparator.*;
import io.XlsxWriter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        logger.log(INFO, "Application started, Logger configured");
        List<University> universities = XlsxReader.readXlsxUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Util.getUniversityComparator(EUniversityComparator.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);

        List<Student> students = XlsxReader.readXlsxStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Util.getStudentComparator(EStudentComparator.AVG_EXAM_SCORE);
        students.sort(studentComparator);

        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsxWriter.writeXlsxStatistics(statisticsList, "statistics.xlsx");
        FullInfo fullInfo = new FullInfo().setStudentList(students).setUniversityList(universities)
                .setStatisticsList(statisticsList).setProcessDate(new Date());
        XmlWriter.generateXmlReq(fullInfo);
        JsonWriter.writeJsonReq(fullInfo);
        logger.log(INFO, "Application finished");
    }
}

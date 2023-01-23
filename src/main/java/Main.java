import Comparator.StudentComparator;
import Comparator.UniversityComparator;
import enums.StudentComparatorType;
import enums.UniversityComparatorType;
import io.XlsReader;
import model.Student;
import model.University;
import util.ComparatorUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(UniversityComparatorType.FULL_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(StudentComparatorType.FULL_NAME);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}

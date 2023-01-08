import enums.StudyProfile;
import model.Student;
import model.University;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAvgExamScore((float) 8.5)
                .setCurrentCourseNumber(3)
                .setFullName("Bazilev Evgeny Viktorovich")
                .setUniversityId("00001");
        System.out.println(student);

        University university = new University();
        university.setId("00001")
                .setFullName("Belarusian State University of Informatics and Radioelectronics")
                .setShortName("BSUIR")
                .setYearOfFoundation(1964)
                .setMainProfile(StudyProfile.COMPUTER_SCIENCE);
        System.out.println(university);
    }
}

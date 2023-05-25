package exception;

class StudentNameFormatException extends IllegalArgumentException {
    public StudentNameFormatException(String message) {
        super(message);
    }
}

class Student {
    private String studentName;
    MyLogger logger = MyLogger.getLogger();

    public Student(String studentName) {
        if (studentName == null) {
            throw new StudentNameFormatException("name must not be null");
        }
        if (studentName.split(" ").length > 3) {
            throw new StudentNameFormatException("name too long");
        }
        this.studentName = studentName;
    }

    public String getStudentName() {
        logger.fine("begin getStudentName");
        return studentName;
    }

    public void setStudentName(String studentName) {
        logger.fine("set getStudentName");
        this.studentName = studentName;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();
        Student student;
        try {
            student = new Student(null);
        } catch (StudentNameFormatException exception) {
            logger.warning(exception.getMessage());
        }
        try {
            student = new Student("Edward Jon Kim Test");
        } catch (StudentNameFormatException exception) {
            logger.warning(exception.getMessage());
        }
        student = new Student("James");
    }
}

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Math", "MAT101", "MAT");
        Course fizik = new Course("Physics", "FZK101", "FZK");
        Course kimya = new Course("Chemical", "KMY101", "KMY");

        Teacher t1 = new Teacher("Hasan", "90550000000", "MAT");
        Teacher t2 = new Teacher("Deniz", "90550000001", "FZK");
        Teacher t3 = new Teacher("Derya", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Emre", 4, "1421", mat, fizik, kimya);
        s1.addBulkExamNote(45 , 10, 47);
        s1.addBulkCourseGrade(75, 52, 72);
        s1.isPass();
        

        Student s2 = new Student("Asım", 4, "2012", mat, fizik, kimya);
        s2.addBulkExamNote(98, 51, 41);
        s2.addBulkCourseGrade(99, 78, 69);
        s2.isPass();

        Student s3 = new Student("Mustafa", 4, "3621", mat, fizik, kimya);
        s3.addBulkExamNote(100, 85, 85);
        s3.addBulkCourseGrade(75, 85, 70);
        s3.isPass();

    }
}

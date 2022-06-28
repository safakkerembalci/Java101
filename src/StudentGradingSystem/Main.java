package StudentGradingSystem;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "532", "MTH");
        Course math = new Course("Math", "101", "MTH");
        math.addTeacher(t1);

        Teacher t2 = new Teacher("Graham Bell", "505", "PHY");
        Course physics = new Course("Physics", "102", "PHY");
        physics.addTeacher(t2);

        Teacher t3 = new Teacher("Kul Yutmaz", "542", "CHM");
        Course chemistry = new Course("Chemistry", "103", "CHM");
        chemistry.addTeacher(t3);


        Student s1 = new Student("Ýnek Þaban", "123", "4", math, physics, chemistry);
        s1.addBulkExamNote(100, 75, 25);
        s1.addBulkVerbalNote(80,55,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "321", "4", math, physics, chemistry);
        s2.addBulkExamNote(50, 35, 25);
        s2.addBulkVerbalNote(30,60,50);
        s2.isPass();

    }
}

package StudentGradingSystem;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;

    }

    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else {
            System.out.println("Teachers and branches do not match!");
        }
        this.teacher = teacher;
    }

    public void printTeacher(){
        this.teacher.print();
    }

}



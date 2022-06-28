package StudentGradingSystem;

public class Student {

    Course math;
    Course physics;
    Course chemistry;
    String name;
    String stuNo;
    String classes;
    double average, mathAverage, physicsAverage, chemistryAverage;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course math, Course physics, Course chemistry){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.mathAverage = 0.0;
        this.physicsAverage = 0.0;
        this.chemistryAverage = 0.0;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mathNote, int physicsNote, int chemistryNote){

        if (mathNote >= 0 && mathNote <= 100){
            this.math.note = mathNote;
        }
        if (physicsNote >= 0 && physicsNote <= 100){
            this.physics.note = physicsNote;
        }
        if (chemistryNote >= 0 && chemistryNote <= 100){
            this.chemistry.note = chemistryNote;
        }
    }

    public void addBulkVerbalNote(int mathVerbalNote, int physicsVerbalNote, int chemistryVerbalNote){

        if (mathVerbalNote >= 0 && mathVerbalNote <= 100){
            this.math.verbalNote = mathVerbalNote;
        }
        if (physicsVerbalNote >= 0 && physicsVerbalNote <= 100){
            this.physics.verbalNote = physicsVerbalNote;
        }
        if (chemistryVerbalNote >= 0 && chemistryVerbalNote <= 100){
            this.chemistry.verbalNote = chemistryVerbalNote;
        }

    }


    public void isPass() {
        System.out.println("********************************");
        this.mathAverage = (this.math.note * 0.8) + (this.math.verbalNote * 0.2);
        this.physicsAverage = (this.physics.note * 0.8) + (this.physics.verbalNote * 0.2);
        this.chemistryAverage = (this.chemistry.note * 0.8) + (this.chemistry.verbalNote * 0.2);
        this.average = (this.mathAverage + this.physicsAverage + this.chemistryAverage) / 3.0;
        if (this.average > 55){
            System.out.println("Pass The Class!");
            this.isPass = true;
        }else {
            System.out.println("Fail The Class!");
            this.isPass = false;
        }
        printNote();
    }

    public void printNote(){
        System.out.println(math.name + " exam note: " + math.note);
        System.out.println(math.name + " verbal note: " + math.verbalNote);
        System.out.println(math.name + " final note: " + mathAverage);
        System.out.println(physics.name + " exam note: " + physics.note);
        System.out.println(physics.name + " verbal note: " + physics.verbalNote);
        System.out.println(physics.name + " final note: " + physicsAverage);
        System.out.println(chemistry.name + " exam note: " + chemistry.note);
        System.out.println(chemistry.name + " verbal note: " + chemistry.verbalNote);
        System.out.println(chemistry.name + " final note: " + chemistryAverage);
        System.out.println("Average: " + this.average);
    }

}

package Inheritance;

public class Assistant extends Academician{

    private String officeHour;

    public Assistant(String nameSurname, String phone, String email, String department, String title, String officeHour) {
        super(nameSurname, phone, email, department, title);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void doQuiz(){
        System.out.println(this.getNameSurname() + " is doing Quiz!");
    }
}

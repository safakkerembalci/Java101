package Inheritance;

public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String phone, String email, String department, String title, String officeHour) {
        super(nameSurname, phone, email, department, title, officeHour);
    }

    public void attendLab(){
        System.out.println(this.getNameSurname() + " is attending Lab Class");
    }
}

package Inheritance;

public class Academician extends Personal{

    private String department;
    private String title;


    public Academician(String nameSurname, String phone, String email, String department, String title) {
        super(nameSurname, phone, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendClass(){
        System.out.println(this.getNameSurname() + " attended the class!");
    }
}

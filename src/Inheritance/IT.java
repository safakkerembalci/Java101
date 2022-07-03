package Inheritance;

public class IT extends Officer{

    private String duty;

    public IT(String nameSurname, String phone, String email, String department, String shift, String duty) {
        super(nameSurname, phone, email, department, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void networkSetup(){

        System.out.println(this.getNameSurname() + " is doing network setup");

    }
}

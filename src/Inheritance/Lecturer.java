package Inheritance;

public class Lecturer extends Academician {

    private String gateNumber;

    public Lecturer(String nameSurname, String phone, String email, String department, String title, String gateNumber) {
        super(nameSurname, phone, email, department, title);
        this.gateNumber = gateNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

}

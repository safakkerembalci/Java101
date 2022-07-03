package Inheritance;

public class Personal {
    private String nameSurname;
    private String phone;
    private String email;

    public Personal(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void entry(){
        System.out.println(this.nameSurname + " entered the university");
    }

    public void exit(){
        System.out.println(this.nameSurname + " left the university");
    }

    public void diningHall(){
        System.out.println(this.nameSurname + " entered the dining hall");
    }
}

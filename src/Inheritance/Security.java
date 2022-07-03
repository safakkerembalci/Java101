package Inheritance;

public class Security extends Officer{

    private String document;

    public Security(String nameSurname, String phone, String email, String department, String shift, String document) {
        super(nameSurname, phone, email, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch(){
        System.out.println(this.getNameSurname() + " is watching");
    }
}

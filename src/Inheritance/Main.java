package Inheritance;

public class Main {

    public static void main(String[] args) {

        Personal p1 = new Personal("Kerem Balci", "0555", "kerembalci@gmail.com");

        System.out.println(p1.getNameSurname());
        p1.entry();

        Academician a1 = new Academician("Solmaz Balci", "0532", "solmaz@hotmail.com", "Literature","Professor");
        System.out.println(a1.getNameSurname());
        a1.exit();
        a1.attendClass();
        Officer o1 = new Officer("ali", "550", "mail", "department", "09.00-12.00");

        o1.work();

        Lecturer l1 = new Lecturer("Davut Balci", "0000", "email2", "dust", "lect", "3");
        l1.entry();
        l1.attendClass();
    }
}

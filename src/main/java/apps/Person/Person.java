package apps.Person;


import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person() {
        this.birthDate = LocalDate.now
    }

    Person(String name, LocalDate birthDate) {
        setName(name);
        setBirthDate(birthDate);
    }

    public void setName(String name) {
        this.name = name;
    }

//    }
//    public void setName(String name){
//        if (LocalDate.now().isBefore())
//    }

    public void  setBirthDate(LocalDate date){
            if (!LocalDate.now().isBefore(date)) {
                birthDate = date;
            }
    }

    public String getName(){
        return name;
    }





    public int getAge(){
        Period.between(birthDate, LocalDate.now()).getYears();
    }



    public static void main(String[] args) {

    }

    public void





//        int a = 15, b = 15;
//        boolean cant = true;
//
//        if(cant && a == b || a >= b) {
//            System.out.println("yes");
//
//        } else if (a != b) {
//            System.out.println("123");
//
//        } else {
//            System.out.println("no");
//        }





}
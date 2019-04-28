package people;


import java.util.StringJoiner;

public class Person implements PersonSpecification {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public Person(String name, int month, int day, int year) {
         this.month= month;
         this.day= day;
         this.year=year;

        int position = name.indexOf(" ");
        firstName = name.substring(0, position);
        lastName = name.substring(position + 1);


    }
public String toString(){
    return firstName + " " + lastName +", " + "born " + month + "/" +day +"/" + year;


}

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public int month() {
        return month;
    }

    @Override
    public int day() {
        return day;
    }

    @Override
    public int year() {
        return year;
    }

    @Override
    public String initials() {
        return firstName.substring(0,1) + lastName.substring(0,1);
    }

    @Override
    public boolean isBoomer() {
        return  year >= 1946 & year <= 1964;
    }
}
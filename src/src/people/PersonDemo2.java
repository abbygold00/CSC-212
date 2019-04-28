package people;

public class PersonDemo2 {
    public static void main(String[] args) {

            Person[] thepeople = new Person[6];
            thepeople[0] = new Person("Bob Dylan",5,24,1941);
            thepeople[1] = new Person("Noomi Rapace",12,28,1974);
            thepeople[2] = new Person("Pharrell Williams",4,5,1973);
            thepeople[3] = new Person("Frank Sinatra",12,12,1915);
            thepeople[4] = new Person("Diana Krall",11,16,1964);
            thepeople[5] = new Person("Abisola Akinfenwa",8,17,2000);
    for(int i = 0; i < thepeople.length; i++){
        System.out.println(thepeople[i]);


    }



    }

}

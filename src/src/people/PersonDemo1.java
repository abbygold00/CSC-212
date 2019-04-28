package people;

public class PersonDemo1 {
    public static void main(String[] args) {
        Person BD = new Person("Bob Dylan",5,24,1941);
        Person NR = new Person("Noomi Rapace",12,28,1974);
        Person PW = new Person("Pharrell Williams",4,5,1973);
        Person FS = new Person("Frank Sinatra",12,12,1915);
        Person DK = new Person("Diana Krall",11,16,1964);
        Person AA = new Person("Abisola Akinfenwa",8,17,2000);

        System.out.println(BD.toString() +" "+ BD.initials()+" "+ BD.isBoomer());
        System.out.println(NR.toString() +" "+ NR.initials()+" "+ NR.isBoomer());
        System.out.println(PW.toString() +" "+ PW.initials()+" "+ PW.isBoomer());
        System.out.println(FS.toString() +" "+ FS.initials()+" "+ FS.isBoomer());
        System.out.println(DK.toString() +" "+ DK.initials()+" "+ DK.isBoomer());
        System.out.println(AA.toString() +" "+ AA.initials()+" "+ AA.isBoomer());

    }
}

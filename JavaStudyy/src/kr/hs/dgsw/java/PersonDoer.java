package kr.hs.dgsw.java;

public class PersonDoer {
    public static void main(String[] args) {
        Person person = new Person();

        for(int i = 0 ; i < 6 ; i++){
            person.getAge();
        }
        person.PersonInfo();
    }
}

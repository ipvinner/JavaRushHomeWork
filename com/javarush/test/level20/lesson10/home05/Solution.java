import com.javarush.test.level19.lesson03.task04.Person;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person.
*/
public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        String fullName;
        final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        Person p = new Person("Ivan", "Ivanov", "Ukraine", Sex.MALE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("c:\\temp\\data.txt"));
        objectOutputStream.writeObject(p);
        objectOutputStream.close();
    }
}

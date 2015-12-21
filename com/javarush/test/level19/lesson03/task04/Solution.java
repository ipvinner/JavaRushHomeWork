package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("c:/data1.txt"), "Cp1251");
        PersonScanner adapter = new PersonScannerAdapter(scan);

        System.out.println(adapter.read().toString());
        adapter.close();
    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner){
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {

            if(this.scanner.hasNext()){
                String lastName = scanner.next();
                String firstName = scanner.next();
                String middleName = scanner.next();

                int day = scanner.nextInt();
                int month = scanner.nextInt() - 1;
                int year = scanner.nextInt();

                Calendar date = new GregorianCalendar(year, month, day);
                return new Person(firstName, middleName, lastName, date.getTime());
            }


            return null;
        }

        @Override
        public void close() throws IOException {
            scanner.close();
        }
    }
}

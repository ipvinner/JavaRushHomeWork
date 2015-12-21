package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {
        threads.add(new ThreadType1());
        threads.add(new ThreadType2());
        threads.add(new ThreadType3());
        threads.add(new ThreadType4());
        threads.add(new ThreadType5());
    }
    public static void main(String[] args) {

    }

    public static class ThreadType1 extends Thread{

        @Override
        public void run() {
            while(true){

            }
        }
    }

    public static class ThreadType2 extends Thread{

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                }
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }


    }

    public static class ThreadType3 extends Thread{

        @Override
        public void run() {

                try {
                    while(true) {
                        System.out.println("Ура");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    public static class ThreadType4 extends Thread implements Message{

        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            while(!currentThread.interrupted()){

            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
            try{
                this.join();
            }catch (Exception e){

            }
        }
    }

    public static class ThreadType5 extends Thread{

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String answer = "0";
            int sum = Integer.parseInt(answer);

            while(true){
                try {
                    answer = reader.readLine();
                       if(answer.equals("N")){
                           break;
                       }else{
                           sum += Integer.parseInt(answer);
                       }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            System.out.println(sum);


        }
    }
}

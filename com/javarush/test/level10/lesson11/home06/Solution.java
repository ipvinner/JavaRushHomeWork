package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private String profession;
        private boolean education;
        private String patronymic;

        public Human(){};

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        };

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        };

        public Human(String name, int age, boolean sex, String patronymic){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.patronymic = patronymic;
        };

        public Human(String name, int age, boolean sex, String patronymic, boolean education){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.patronymic = patronymic;
            this.education = education;
        }

        public Human(String name, int age, boolean sex, String patronymic, boolean education, String profession){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.patronymic = patronymic;
            this.education = education;
            this.profession = profession;
        }

        public Human(String name, int age, boolean sex, String patronymic, String profession){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.patronymic = patronymic;
            this.profession = profession;
        }

        public Human(String name, int age, boolean sex, boolean education, String profession){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.education = education;
            this.profession = profession;
        }

        public Human(String name, int age, boolean sex, boolean education){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.education = education;
        }



        //напишите тут ваши переменные и конструкторы
    }
}

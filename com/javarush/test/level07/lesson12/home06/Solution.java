package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human ivan1 = new Human("Иван", true, 120, null, null);
        Human trofim = new Human("Трофим", true, 110, null, null);
        Human anna = new Human("Анна", false, 100, null, null);
        Human klavdia = new Human("Клавдия", false, 100, null, null);

        Human vladimir = new Human("Владимир", true, 61, trofim, klavdia);
        Human natalia = new Human("Наталья", false, 60, ivan1, anna);

        Human alexey = new Human("Алексей", true, 37, natalia, vladimir);
        Human ivan2 = new Human("Иван", true, 26, natalia, vladimir);
        Human boris = new Human("Борис", true, 20, natalia, vladimir);

        System.out.println(ivan1.toString());
        System.out.println(trofim.toString());
        System.out.println(anna.toString());
        System.out.println(klavdia.toString());

        System.out.println(vladimir.toString());
        System.out.println(natalia.toString());

        System.out.println(alexey.toString());
        System.out.println(ivan2.toString());
        System.out.println(boris.toString());
    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;
        //Написать тут ваш код

        public Human(String name, Boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}

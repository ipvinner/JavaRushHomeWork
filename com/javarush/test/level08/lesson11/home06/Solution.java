package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> firstList = new ArrayList<Human>();
        Human alexey = new Human("Алексей", true, 37, firstList);
        Human ivan2 = new Human("Иван", true, 26, firstList);
        Human boris = new Human("Борис", true, 20, firstList);

        ArrayList<Human> secondList = new ArrayList<Human>();
        secondList.add(alexey);
        secondList.add(ivan2);
        secondList.add(boris);

        Human vladimir = new Human("Владимир", true, 61, secondList);
        Human natalia = new Human("Наталья", false, 60, secondList);

        ArrayList<Human> mothersList = new ArrayList<Human>();
        mothersList.add(natalia);
        ArrayList<Human> fatherList = new ArrayList<Human>();
        fatherList.add(vladimir);

        Human trofim = new Human("Трофим", true, 110, fatherList);
        Human klavdia = new Human("Клавдия", false, 100, fatherList);

        Human ivan1 = new Human("Иван", true, 120, mothersList);
        Human anna = new Human("Анна", false, 100, mothersList);

        System.out.println(ivan1.toString());
        System.out.println(trofim.toString());
        System.out.println(anna.toString());
        System.out.println(klavdia.toString());

        System.out.println(vladimir.toString());
        System.out.println(natalia.toString());

        System.out.println(alexey.toString());
        System.out.println(ivan2.toString());
        System.out.println(boris.toString());




//

    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;

        private ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}

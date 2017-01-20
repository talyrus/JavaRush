package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";
        zerg6.name = "zerg6";
        zerg7.name = "zerg7";
        zerg8.name = "zerg8";
        zerg9.name = "zerg9";
        zerg10.name = "zerg10";
        //Protos
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "protos1";
        protos2.name = "protos2";
        protos3.name = "protos3";
        protos4.name = "protos4";
        protos5.name = "protos5";
        //Terran's
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "terran1";
        terran2.name = "terran2";
        terran3.name = "terran3";
        terran4.name = "terran4";
        terran5.name = "terran5";
        terran6.name = "terran6";
        terran7.name = "terran7";
        terran8.name = "terran8";
        terran9.name = "terran9";
        terran10.name = "terran10";
        terran11.name = "terran11";
        terran12.name = "terran12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
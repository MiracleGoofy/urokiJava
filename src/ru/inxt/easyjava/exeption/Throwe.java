package ru.inxt.easyjava.exeption;

import java.util.HashMap;
import java.util.Map;

public class Throwe {

    public static void main(String[] args) {
//        try {
//            getHealthString("Vasya");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        getHealthString("Ivan");
        System.out.println("I'm still working");
    }

    public static String getHealthString(String name) throws RuntimeException{
        Map<String,Integer> characterHealth = new HashMap<>();
        Integer health = characterHealth.get(name);
   //     return health.toString();
        try {
            return health.toString();
        } catch (Exception e) {
        //    System.out.println(e.getMessage());

            throw new RuntimeException("No character found with name " + name);
        }


    }
}

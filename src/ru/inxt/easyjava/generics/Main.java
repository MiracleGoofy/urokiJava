package ru.inxt.easyjava.generics;

public class Main {

    public static void main(String[] args) {

            Box box1 = new Box(50);
            Box box2 =new Box("String");
            box2.setObj(30);

            if(box1.getObj() instanceof Integer && box2.getObj() instanceof Integer){
                int result = (Integer)box1.getObj() + (Integer) box2.getObj();
                System.out.println(result);
            }

            BoxGen<Integer> intBox1 = new BoxGen<>(3);
            BoxGen<Integer> intBox2 = new BoxGen<>(5);

            NumberBox<Integer> integerNumberBox = new NumberBox<>(new Integer[]{1,2,3,4,5});
            NumberBox<Double> doubleNumberBox = new NumberBox<>(new Double[]{1.,2.,3.,4.,5.});
            System.out.println(integerNumberBox.average());
            System.out.println(doubleNumberBox.average());
        System.out.println(integerNumberBox.compare(doubleNumberBox));
     }
}

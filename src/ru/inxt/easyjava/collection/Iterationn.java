package ru.inxt.easyjava.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterationn {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrayList.add(i);
        }
        Iterator<Integer> integerIterator = arrayList.iterator();
//        while (integerIterator.hasNext()) {
//            int a = integerIterator.next();
//            if(a>10 && a<20) integerIterator.remove();
//        }
//        System.out.println("ONE -- " + arrayList);
    //    ListIterator<Integer> listIterator = arrayList.listIterator();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(4);
        arrayList1.add(2);
        Iterator<Integer> integerIterator1 = arrayList1.iterator();
        while (integerIterator1.hasNext()) {
    //        int a = integerIterator1.next();
            if(integerIterator1.next() == 2) integerIterator1.remove();
        }
            System.out.println("TWO -- " + arrayList1);
    }
}

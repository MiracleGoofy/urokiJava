package ru.inxt.easyjava.generics;

public class NumberBox <N extends Number> {

    private  N[] numbers;
    public NumberBox(N[] numbers){
        this.numbers = numbers;
    }

    public double average(){
        double d = 0.0;
        for (N number : numbers) {
            d+= number.doubleValue();
        }
        return d/this.numbers.length;
    }

     public boolean compare(NumberBox<?> anotherBox ){

        // return this.average() == anotherBox.average();
         return Math.abs(this.average() -anotherBox.average()) < 0.0001f;
     }
}

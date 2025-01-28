// This code is my own work. It was written without consulting code written by other students or code from online resources. Antonio Faria/

public class Main {
    public static void main(String[] args) { int number=12; double weight=.25;
        String fruit="Apple";
        System.out.println("Number:"+number);
        System.out.println("Weight:"+weight);
        System.out.println("Fruit:"+fruit);

        //Calculate total weight
        double totalWeight=number*weight; System.out.println("The total    weight of all " + fruit + "s is " + totalWeight);
        number=number+5;
        System.out.println("After buying more apples, the total number of   apples is " + number + ".");
        String fruitMessage = "the fruit is " + fruit; System.out.println(fruitMessage);
        double radius = 2.0;
                System.out.println("The radius of the fruit is " + radius + ".");
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The      surface area of the apple is " + surfaceArea );
        System.out.println("The volume of the      apple is " + volume + " cubic units.");
    }
}

package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        Dryer firstDryer = new Dryer();
        Dryer secondDryer = new Dryer(5, 50, 2000,"Samsung");
        Dryer thirdDryer = new Dryer(7, 60, 2500 ,"LG", 522, "Black", 2);

        System.out.println(firstDryer.toString());
        System.out.println(secondDryer.toString());
        System.out.println(thirdDryer.toString());

        System.out.println("Printing static int Number: " + firstDryer.printNumber());
        System.out.println("Printing static int Number: " + secondDryer.printNumber());
        System.out.println("Printing static int Number: " + thirdDryer.printNumber());

        System.out.println("Static method : " + Dryer.printStaticNumber());
    }
}

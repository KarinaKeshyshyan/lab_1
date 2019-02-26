package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        Dryer M1 = new Dryer();
        Dryer M2 = new Dryer(5, 50, 2000,"Samsung");
        Dryer M3 = new Dryer(7, 60, 2500 ,"LG", 522, "Black", 2);

        System.out.println(M1.toString());
        System.out.println(M2.toString());
        System.out.println(M3.toString());

        System.out.println("Printing static int AgeLimit: " + M1.printNumber());
        System.out.println("Printing static int AgeLimit: " + M2.printNumber());
        System.out.println("Printing static int AgeLimit: " + M3.printNumber());

        System.out.println("Static method : " + Dryer.printStaticNumber());
    }
}

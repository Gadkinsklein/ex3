import java.util.Scanner;

public class Main {
    static Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Enter username");
        double temp = collectInput();

        double f2c = celsius(temp);

        displayTemp(f2c);
    }


    static double collectInput() {
        System.out.println("Please enter a value in Farenheight");
        double fahr = myObj.nextDouble();
        return fahr;

    }

    static double celsius(double a) {
        double fahr2cel = (a - 32) / 1.8;
        return fahr2cel;

}

    static void displayTemp(double a){
        System.out.println("Your converted temperature is " + a +" Celsius");
    }























}

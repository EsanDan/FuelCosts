import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of gallons og gas in the tank: ");

        if(in.hasNextDouble())
        {
            double gallons = in.nextDouble();
            System.out.println("Enter the effeciency in miles per gallons:");

            if(in.hasNextDouble()) {
                double effeciency = in.nextDouble();
                System.out.println("Enter the price of gas per gallons:");

                if (in.hasNextDouble()) {
                    double pricePerGallon = in.nextDouble();
                    double costPer100Miles = (100.0 / effeciency) * pricePerGallon;
                    double distance = gallons * effeciency;
                    System.out.println("Cost per 100 miles: $" + costPer100Miles);
                    System.out.println("Distance the car can go with the gas in the tank: " + distance + "miles");
                } else if (in.hasNextDouble()){
                    System.out.println("Invalid input for price of gas per gallon");
                }
                 else{
                    System.out.println("Invalid input for fuel effeciency");
                }
                in.close();
            }

        }
    }
}
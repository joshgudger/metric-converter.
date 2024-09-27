
import java.util.Scanner;

public class App {
    
    
    
    float centimeters;
    float kilograms;
    float pounds;
    float mph;
    float kph;





    public static void main(String[] args) throws Exception {
       boolean response = true;
       
       
      while (response){

      
       System.out.println("Welcome to the metric conversion app!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a conversion type");
        System.out.println("1. inches to feet");
        System.out.println("2. kilograms to pounds");
        System.out.println("3. centimeters to inches");
        System.out.println("4. mph to kph");
       
       
        System.out.println("Enter your choice of conversion.");
        
         int conversion = (scanner.nextInt());
        if (conversion == 1) {
            System.out.print("Enter inches: ");
            float inches = (scanner.nextFloat());
            float feet = inches / 12;
            System.out.println(inches + "inches is equal to " + feet + "feet.");
        
        } else if (conversion == 2) {
            System.out.print( "Enter kilograms: ");
           float kilograms = (scanner.nextFloat());
           float pounds = kilograms * 2.2062f;
           System.out.println(kilograms + "kilograms is equal to " + pounds + "pounds."); 
        
         } else if (conversion == 3) { System.out.print( " Enter centimeters: ");
            float centimeters = (scanner.nextFloat());
            float inches = centimeters * 0.393701f;
            System.out.println(centimeters + " centimeters is equal to " + inches + "inches.");
            
         } else if (conversion == 4 ) {System.out.print( "Enter mph: ");
          float mph = (scanner.nextFloat());
          float kph = mph * 1.6034f;
          System.out.println(mph + " miles per hour is equal to" + kph + "kilometers. ");
        
        
        
        } else { 
            System.out.print("Not a valid input, 1-4 please.");}
          
            System.out.println("Do you want to continue yes/no");
            String userresponse = scanner.next().toLowerCase();

            if (userresponse.equals("no")){
                response = false;
            System.out.print("goodbye then.");}
      } 
        
        }
       
        
    }


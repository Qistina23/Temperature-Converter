import javax.swing.JOptionPane;
import java.util.Scanner;

public class temperatureConvert{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for conversion choice
        System.out.println("Choose Conversion Type:");
        System.out.println("1: Fahrenheit to Celsius (Using Dialog Box)");
        System.out.println("2: Celsius to Fahrenheit (Using Console)");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            // Fahrenheit to Celsius conversion (using dialog box)~
            String input = JOptionPane.showInputDialog("Enter temperature in Fahrenheit:");
            try {
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + String.format("%.2f", celsius) + "°C");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.");
            }
        } else if (choice == 2) {
            // Celsius to Fahrenheit conversion (using console)
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        } else {
            // Invalid choice
            System.out.println("Wrong Choice.");
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class TemperatureConverter {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Conversion Program");
        System.out.println("------------------------------");
        
        try {
            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("\nSelect the original unit of measurement:");
            System.out.println("1. Celsius (°C)");
            System.out.println("2. Fahrenheit (°F)");
            System.out.println("3. Kelvin (K)");
            
            System.out.print("Enter your choice (1-3): ");
            String unitChoice = scanner.nextLine();
            
            if (unitChoice.equals("1")) { // Celsius
                double fahrenheit = celsiusToFahrenheit(temperature);
                double kelvin = celsiusToKelvin(temperature);
                
                System.out.printf("\n%.2f °C is equivalent to:\n", temperature);
                System.out.printf("%.2f °F\n", fahrenheit);
                System.out.printf("%.2f K\n", kelvin);
                
            } else if (unitChoice.equals("2")) { // Fahrenheit
                double celsius = fahrenheitToCelsius(temperature);
                double kelvin = fahrenheitToKelvin(temperature);
                
                System.out.printf("\n%.2f °F is equivalent to:\n", temperature);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f K\n", kelvin);
                
            } else if (unitChoice.equals("3")) { // Kelvin
                double celsius = kelvinToCelsius(temperature);
                double fahrenheit = kelvinToFahrenheit(temperature);
                
                System.out.printf("\n%.2f K is equivalent to:\n", temperature);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                
            } else {
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number for temperature.");
        } finally {
            scanner.close();
        }
    }
} 
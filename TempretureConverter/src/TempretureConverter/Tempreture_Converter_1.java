package TempretureConverter;
import java.util.Scanner;

public class Tempreture_Converter_1  
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Convertor");
        System.out.println("Supported units: Celsius (C), Fahrenheit (F), Kelvin (K)");

        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the original unit (C/F/K): ");
        String originalUnit = input.next().toUpperCase();

        double convertedTemperature1 = 0.0;
        double convertedTemperature2 = 0.0;
        String targetUnit1 = "";
        String targetUnit2 = "";

        if (originalUnit.equals("C")) 
        {
            convertedTemperature1 = celsiusToFahrenheit(temperature);
            convertedTemperature2 = celsiusToKelvin(temperature);
            targetUnit1 = "Fahrenheit (F)";
            targetUnit2 = " Kelvin(K)";
        } 
        else if (originalUnit.equals("F")) 
        {
            convertedTemperature1 = fahrenheitToCelsius(temperature);
            convertedTemperature2 = fahrenheitToKelvin(temperature);
            targetUnit1 = "Celsius(C)";
            targetUnit2= " Kelvin(K)";
        } 
        else if (originalUnit.equals("K")) 
        {
            convertedTemperature1 = kelvinToCelsius(temperature);
            convertedTemperature2 = kelvinToFahrenheit(temperature);
            targetUnit1 = "Celsius(C)";
            targetUnit2 = "Fahrenheit(F)";
        } 
        else
        {
            System.out.println("Invalid input unit. Please use C, F, or K.");
            input.close();
            return;
        }

        System.out.println(temperature + " " + originalUnit + " is equivalent to:");
        System.out.println(convertedTemperature1 + " " + targetUnit1 + " And " + convertedTemperature2 + " " + targetUnit2);

        input.close();
    }

    public static double celsiusToKelvin(double celsius) 
    {
        return celsius + 273.15;
    }


	public static double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double fahrenheitToKelvin(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) 
    {
        return kelvin - 273.15;
    }
    
    public static double kelvinToFahrenheit(double kelvin) 
    {
        return (kelvin - 273.15) * 9/5 + 32;
    }

}

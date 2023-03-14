/*Temperatur
Nu ska vi omvandla från Celcius till Fahrenheit och till Kelvin
Skriv ett program som tar emot en Celcius temperatur och omvandlar
till Fahrenheit, sen till Kelvin och slutligen tillbaka till din Celcius.
Skriv ut Celcius, Fahrenheit och Kelvin
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Temperaturprogram ifrån Celsius, till Fahrenheit, till Kelvin och sedan tillbaka till Celsius igen. " + "\n");

        Scanner temperatureAsk = new Scanner(System.in);
        System.out.print("Ange temperatur i Celsius: ");
        double celsius = temperatureAsk.nextDouble();

        double celsiusToFahrenheit = celsius * 1.8 + 32;
        double celsiusToKelvin = celsius + 273.15;
        double fahrenheitToCelsius = (celsiusToFahrenheit -32) / 1.8;
        double fahrenheitToKelvin = (celsiusToFahrenheit + 459.67) / 1.8;
        double kelvinToFahrenheit = fahrenheitToKelvin * 1.8 - 459.67;
        double kelvinToCelsius = fahrenheitToKelvin - 273.15;

        System.out.println("\n" + "Celsiustemperaturen är: " + celsius);
        System.out.println("Kelvintemperaturen är: " + celsiusToKelvin);
        System.out.println("Fahrenheittemperaturen är: " + celsiusToFahrenheit);
    }
}
package weekthird;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float Fahrenheit, Celsius;
        Fahrenheit = 72;
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius is: "+Celsius);
    }
}

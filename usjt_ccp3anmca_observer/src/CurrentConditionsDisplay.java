public class CurrentConditionsDisplay extends Display {
    @Override
    public void display() {

    }



    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("---- Condições Atuais----");
        System.out.printf("Temp: %.0f, Hum: %.2f%%, Pres: %.2f\n",temperature,humidity,pressure);
    }
}
import java.util.Random;

public class ForecastDisplay extends Display {
    private Random gerador = new Random();

    @Override
    public void display() {

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        double previsao = temperature - 2 + gerador.nextDouble() * 4;
        System.out.println("---- Previsões----\n");
        System.out.printf("Previsão para o próximo dia: %.2f\n",previsao);
    }
}
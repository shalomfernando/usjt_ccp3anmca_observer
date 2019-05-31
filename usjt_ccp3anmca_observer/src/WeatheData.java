
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatheData implements Subject {

    private List<Observer> observerList;

    public WeatheData() {
        this.observerList = new LinkedList<>();
    }

    private double temperatura;
    private double pressure;
    private double humidity;
    private double calor;

    public double getCalor() {
        return calor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObeserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observerList) {
            ob.update(temperatura, humidity, pressure);
        }
    }

    public void iniciar() throws InterruptedException {
        Random gerador = new Random();
        while (true) {
            temperatura = 30 + gerador.nextDouble() * 5;
            humidity = 20 + gerador.nextDouble() * 55;
            pressure = 800 + gerador.nextDouble() * 400;
            measurementsChanged();
            Thread.sleep(10000);
        }
    }

}
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        WeatheData estacaoMonitoramento = new WeatheData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatsDisplay statsDisplay = new StatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        IndiceCalor indiceCalor = new IndiceCalor();
        estacaoMonitoramento.registerObeserver(currentConditionsDisplay);
        estacaoMonitoramento.registerObeserver(statsDisplay);
        estacaoMonitoramento.registerObeserver(forecastDisplay);
        estacaoMonitoramento.registerObeserver(indiceCalor);
        estacaoMonitoramento.iniciar();
    }

}
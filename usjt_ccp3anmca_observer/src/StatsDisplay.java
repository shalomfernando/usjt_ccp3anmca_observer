public  class StatsDisplay extends Display{
    @Override
    public void display() {

    }
    private int qtde = 0;
    private double totalHistorico = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        qtde++;
        totalHistorico += temperature;
        System.out.println("---- Dados Estatístico ----");
        System.out.printf("Média: %.2f\n",totalHistorico/qtde);
    }
}
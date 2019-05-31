public class IndiceCalor extends Display {
    @Override
    public void display() {

    }

    private static final double c1 = -42.397;
    private static final double c2 = 2.04901523;
    private static final double c3 = 10.14333127;
    private static final double c4 = -0.22475541;
    private static final double c5 = -6.83783 * 0.001;
    private static final double c6 = -5.481717 * 0.01;
    private static final double c7 = 1.22874 * 0.001;
    private static final double c8 = 8.5282 * 0.0001;
    private static final double c9 = -1.99 * 0.000001;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        double temperaturaF = 1.8 * temperature+32;
        double ic = 0.551 * (c1 + c2 * temperaturaF + c3 * humidity + c4 * temperaturaF * humidity + c5 * temperaturaF * temperaturaF
                + c6 * humidity * humidity + c7 * temperaturaF * temperaturaF * humidity + c8 * temperaturaF * humidity * humidity +
                c9 * temperaturaF * temperaturaF * humidity * humidity - 32);
        System.out.println("---- Indice de Calor ----");
        System.out.printf("Indice: %.2f\n",ic);
    }
}
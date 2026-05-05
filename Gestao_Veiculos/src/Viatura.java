public class Viatura {
    private String tipoViatura;
    private int numRodas;
    private int maxVel;

    public Viatura() {
    }

    public Viatura(String tipoViatura, int numRodas, int maxVel) {
        this.tipoViatura = tipoViatura;
        this.numRodas = numRodas;
        this.maxVel = maxVel;
    }

    public String getTipoViatura() {
        return tipoViatura;
    }
    public void setTipoViatura(String tipoViatura) {
        this.tipoViatura = tipoViatura;
    }
    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int getMaxVel() {
        return maxVel;
    }
    public void setMaxVel(int maxVel) {
        this.maxVel = maxVel;
    }

    public void mostrarInfo() {
        System.out.println("\n\n****************** GERIR VEÍCULO ******************\n");
        System.out.print("-> Tipo: ");
        System.out.println(tipoViatura);
        System.out.print("-> Número de rodas da Viatura: ");
        System.out.println(numRodas);
        System.out.print("-> Velocidade Máxima da Viatura: ");
        System.out.print(maxVel);
        System.out.println(" Km/h\n");
    }
}
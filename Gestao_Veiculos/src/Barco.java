public class Barco extends Viatura {

    private boolean temPiscina;

    public Barco() {
        super("Barco", 0, 0);
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }  

    @Override
    public void mostrarInfo() {
        System.out.println("\n\n****************** GERIR BARCO ******************\n");
        System.out.print("-> Tipo: ");
        System.out.println(getTipoViatura());
        System.out.print("-> Número de rodas da Barco: ");
        System.out.println(getNumRodas());
        System.out.print("-> Velocidade Máxima da Barco: ");
        System.out.print(getMaxVel());
        System.out.println(" Km/h");
        System.out.print("-> Tem Piscina: ");
        if(temPiscina) {
            System.out.println("Tem Piscina");
        } else {
            System.out.println("Não Tem Piscina");
        } 
    }
}

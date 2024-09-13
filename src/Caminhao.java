public class Caminhao extends Veiculo {

    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    void mover() {
        System.out.println("O caminhão está transportando carga.");
    }

}

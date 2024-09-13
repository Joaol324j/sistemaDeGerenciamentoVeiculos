public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas ) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    void mover() {
        System.out.println("O carro está acelerando na estrada.");
    }

}

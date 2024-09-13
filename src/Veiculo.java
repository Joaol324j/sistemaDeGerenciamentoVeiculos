public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirDetalhes() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano);
    }

    void mover() {
        System.out.println("O veículo " + modelo + " está se movendo");
    }

}

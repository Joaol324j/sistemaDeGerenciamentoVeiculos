
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB500", 2019, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2022, 25.5);
        Onibus onibus = new Onibus("Mercedes", "Sprinter", 2018, 20);


        carro.exibirDetalhes();
        carro.mover();

        moto.exibirDetalhes();
        moto.mover();

        caminhao.exibirDetalhes();
        caminhao.mover();

        onibus.exibirDetalhes();
        onibus.mover();

    }
}
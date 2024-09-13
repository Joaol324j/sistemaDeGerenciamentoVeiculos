public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    void mover() {
        System.out.println("A moto está ziguezagueando pelo trânsito.");
    }

}

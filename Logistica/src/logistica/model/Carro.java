
package logistica.model;

public class Carro implements Veiculo {
    
    private String nome;
    private String tipo;
    private String placa;
    private double combustivel;
    private double consumo;
    
    private int qtdadePortas;

    public Carro(String nome, String tipo, String placa, double combustivel, double consumo, int qtdadePortas) {
        this.nome = nome;
        this.tipo = tipo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.qtdadePortas = qtdadePortas;
    }
    
    public int getQtdadePortas() {
        return qtdadePortas;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public double getCombustivel() {
        return this.combustivel;
    }

    @Override
    public double getConsumo() {
        return this.consumo;
    }
    
    @Override
    public void setPlaca() {
        this.placa = placa;
    }

    @Override
    public void setCombustivel() {
        this.combustivel = combustivel;
    }

    @Override
    public void setConsumo() {
        this.consumo = consumo;
    }
    
    @Override
    public double gastoCombustivel(double distancia, double valorCombustivel) {
        return (distancia / this.consumo) * valorCombustivel ;
    }

    @Override
    public String toString() {
        return "\n{" + "Nome = " + nome + 
                "\n Tipo = " + tipo + 
                "\n Placa = " + placa + 
                "\n Combustivel = " + combustivel + " L" +
                "\n Consumo = " + consumo + " km/L" + 
                "\n Quantidade de portas = " + qtdadePortas + '}' + "\n";
    }

}
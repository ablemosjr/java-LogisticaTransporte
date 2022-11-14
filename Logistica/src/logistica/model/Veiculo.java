
package logistica.model;

public interface Veiculo {
    
    public String getNome();
    public String getTipo();
    
    public String getPlaca();
    public void setPlaca();
    
    public double getCombustivel();
    public void setCombustivel();
    
    public double getConsumo();
    public void setConsumo();
    
    public double gastoCombustivel(double distancia, double valorCombustivel);
    
}

/*
 Veículo tem um nome, tipo (carro, moto, caminhão), combustível, consumo e placa:
- Retornar o gasto com combustível, dado a distância e o valor do combustível. (1 ponto)
- Retornar e definir seus atributos (gets e sets para combustível, consumo e placa). (1 ponto)
*/


package logistica.model;

public class Viagem implements Comparable<Viagem> {
    
    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private double diariasCondutor;
    
    private Veiculo veiculo;
    private Condutor condutor;
    
    private double custos;

    public Viagem(Condutor condutor, Veiculo veiculo, double diariasCondutor, String cidadeOrigem, String cidadeDestino, double distancia) {
        this.condutor = condutor;    
        this.veiculo = veiculo;
        this.diariasCondutor = diariasCondutor;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia; 
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getDiariasCondutor() {
        return diariasCondutor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public double getCustos() {
        return custos;
    }

    public double custo(double custoCombustivel) {
        /*
        método custo() engloba o 
        consumo de combustível e as diárias do condutor. 
        Considere que um condutor pode dirigir no máximo 700 quilômetros por dia.
        */
        double combustivel = this.veiculo.gastoCombustivel(this.distancia, custoCombustivel);
        
        if(this.distancia > 700) {
            
            int diasViagem = (int) this.distancia / 700;
            double custoDiarias = diasViagem * this.diariasCondutor;         
            return this.custos = custoDiarias + combustivel;
            
        } else {
            
            return this.custos = this.diariasCondutor + combustivel;
        }
    }

    @Override
    public String toString() {
            return "\n\nVIAGEM " + condutor + 
                "\n Veículo = " + veiculo + 
                "\n Diárias do Condutor = R$ " + diariasCondutor + 
                "\n Cidade Origem = " + cidadeOrigem + 
                "\n Cidade Destino = " + cidadeDestino + 
                "\n Distância = " + distancia + " km" + 
                "\n Custos totais da viagem = R$ " + custos + "\n";
    }

    @Override
    public int compareTo(Viagem v) {
        return Double.valueOf(this.getCustos()).compareTo(Double.valueOf(v.getCustos()));
    }

}
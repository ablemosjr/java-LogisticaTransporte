/*
=====================================
Lista AC2 - Interfaces - Logística
=====================================

Uma empresa deseja um sistema para controlar seus veículos, condutores e viagens. Segundo o gerente de logística, um veículo tem um nome, tipo (carro, moto, caminhão), combustível, consumo e placa. O condutor tem um nome, cpf, data de nascimento e salário. 
Uma viagem deve ter uma cidade de origem, cidade de destino, distância, veículo e condutor.


CRITÉRIOS DE AVALIAÇÃO

A interface Veículo deve definir métodos para: 
- Retornar o gasto com combustível, dado a distância e o valor do combustível. (1 ponto)
- Retornar e definir seus atributos (gets e sets para combustível, consumo e placa). (1 ponto)

As classe Moto deve implementar a interface Veículo e acrescentar o atributo cilindradas. (1 ponto)
As classe Carro deve implementar a interface Veículo e acrescentar o atributo quantidade de portas. (1 ponto)
As classe Caminhão deve implementar a interface Veículo e acrescentar o atributo quantidade de eixos. (1 ponto)

A classe Viagem deve conter um método custo() que engloba o consumo de combustível e as diárias do condutor. Considere que um condutor pode dirigir no máximo 700 quilômetros por dia. (1 ponto)

 
Crie uma classe Relatórios que contém os métodos: (2 pontos)

- imprimeCondutores() que imprime todos os condutores ordenados por cpf.
- imprimeVeiculos() que imprime todos os veículos de todos os tipos (moto, carro, caminhão) ordenados por nome.
- imprimeViagens() que imprime todas as viagens ordenadas pelo custo.


Crie a classe FolhaDePagamento que contém os atributos mês e ano e os métodos:
- totalAPagar(), que calcula o valor total a pagar (1 ponto)
- imprimir(), que imprime todos os condutores e seus respectivos salários, bem como o total a pagar. (1 ponto)



- Não criar as classes apropriadas (-1 ponto)
- Não utilizar a interface Veiculo (-1 ponto)
- Não fazer os encapsulamentos (-1 ponto)
- Não implementar a interface Comparable quando necessária (-1 ponto)
- Não criar restrições quando necessárias (-1 ponto)
*/

package logistica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import logistica.model.Caminhao;
import logistica.model.Carro;
import logistica.model.Condutor;
import logistica.model.Moto;
import logistica.model.Relatorio;
import logistica.model.Veiculo;
import logistica.model.Viagem;

public class Controlador {

    public static void main(String[] args) {
        
//     Cria lista de Veículos        
        List<Veiculo> veiculo = new ArrayList<>(){{
//            String nome, String tipo, String placa, double combustivel, double consumo, int qtdadeEixos
            add(new Caminhao("Volvo", "Caminhao", "AAA-0000", 120, 15, 3)); // 0
            add(new Caminhao("Ford", "Caminhao", "AAA-1111", 110, 13, 2)); // 1
            add(new Caminhao("KIA", "Caminhao", "AAA-2222", 100, 10, 1)); // 2
            
//            String nome, String tipo, String placa, double combustivel, double consumo, int qtdadePortas
            add(new Carro("Ford Fiesta", "Carro", "BBB-0000", 44, 9, 4)); // 3
            add(new Carro("Hyundai HB20", "Carro", "BBB-1111", 46, 9, 4)); // 4
            add(new Carro("Chevrolet Onyx", "Carro", "BBB-2222", 45, 9, 2)); // 5

//            String nome, String tipo, String placa, double combustivel, double consumo, double cilindradas
            add(new Moto("Yamaha R1", "Aviao", "CCC-0000", 17, 10, 998)); // 6
            add(new Moto("Honda PCX", "Moto", "CCC-1111", 8, 30, 149.3)); // 7
            add(new Moto("Harley Davidson Fat Bob", "Moto", "CCC-2222", 14, 20, 1868)); // 8
            add(new Moto("Caloi 10 - Test", "Bicicleta", "0", 0, 0, 0)); // 9
        }};   
        
//     Cria lista de Condutores        
        List<Condutor> condutor = new ArrayList<>() {{
//            String nome, String cpf, LocalDate dataNascimento, double salario
            add(new Condutor("Joao", "10.000.000-01", LocalDate.of(1990, 01, 01), 1200));
            add(new Condutor("Maria", "80.000.000-02", LocalDate.of(1992, 10, 10), 1700));
            add(new Condutor("Marcelo", "40.000.000-03", LocalDate.of(1994, 11, 21), 1000));
            add(new Condutor("Carina", "20.000.000-04", LocalDate.of(1989, 05, 17), 1600));
            add(new Condutor("Pedro", "12.000.000-05", LocalDate.of(1997, 02, 03), 2000));
        }};

//     Cria lista de Viagens        
        List<Viagem> viagem = new ArrayList<>() {{ 
//            Condutor condutor, Veiculo veiculo, double diariasCondutor, String cidadeOrigem, String cidadeDestino, double distancia
            add(new Viagem(condutor.get(1), veiculo.get(8), 150, "Sorocaba / SP", "Londrina / PR", 452.6));
            add(new Viagem(condutor.get(0), veiculo.get(1), 120, "Sorocaba / SP", "São Paulo / SP", 104));
            add(new Viagem(condutor.get(2), veiculo.get(5), 200, "Sorocaba / SP", "Bonito / MS", 1100.6));
            add(new Viagem(condutor.get(4), veiculo.get(0), 250, "Sorocaba / SP", "Santarém / PA", 3261));
            add(new Viagem(condutor.get(3), veiculo.get(4), 150, "Sorocaba / SP", "Porto Alegre / RS", 1106.6));
        }}; 
        
//       Cria custos para viagens            
//        Double custoCombustivel
        viagem.get(0).custo(3.50);
        viagem.get(1).custo(4.50);
        viagem.get(2).custo(4.50);
        viagem.get(3).custo(5.50);
        viagem.get(4).custo(5.50);

//        Impressão das viagens
        System.out.println("\n");
        //System.out.println(viagem.toString());

//        Impressão dos condutores ordenados por CPF
        System.out.println("\n\n");
        //Relatorio.imprimeCondutores(condutor);

//        Impressão das viagens ordenados por Custos da Viagem
        System.out.println("\n");
        //Relatorio.imprimeCondutores(viagem);        

//        Impressão dos veículos ordenados por Tipo
        System.out.println("\n");        
        Relatorio.imprimeVeiculos(veiculo);
    }
    
}
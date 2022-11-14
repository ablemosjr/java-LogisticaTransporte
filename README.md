## Lista AC2 - Interfaces - Logística

Uma empresa deseja um sistema para controlar seus veículos, condutores e viagens. Segundo o gerente de logística, um veículo tem um nome, tipo (carro, moto, caminhão), combustível, consumo e placa. O condutor tem um nome, cpf, data de nascimento e salário. Uma viagem deve ter uma cidade de origem, cidade de destino, distância, veículo e condutor.

  
### CRITÉRIOS DE AVALIAÇÃO

__1.__ A interface Veículo deve definir métodos para:  
- Retornar o gasto com combustível, dado a distância e o valor do combustível. (1 ponto)  
- Retornar e definir seus atributos (gets e sets para combustível, consumo e placa). (1 ponto)

__2.__ As classe Moto deve implementar a interface Veículo e acrescentar o atributo cilindradas. (1 ponto)
  
__3.__ As classe Carro deve implementar a interface Veículo e acrescentar o atributo quantidade de portas. (1 ponto)  
 
__4.__ As classe Caminhão deve implementar a interface Veículo e acrescentar o atributo quantidade de eixos. (1 ponto)

__5.__ A classe Viagem deve conter um método custo() que engloba o consumo de combustível e as diárias do condutor. Considere que um condutor pode dirigir no máximo 700 quilômetros por dia. (1 ponto)

__6.__ Crie uma classe Relatórios que contém os métodos: (2 pontos)

- imprimeCondutores() que imprime todos os condutores ordenados por cpf.  
- imprimeVeiculos() que imprime todos os veículos de todos os tipos (moto, carro, caminhão) ordenados por nome.  
- imprimeViagens() que imprime todas as viagens ordenadas pelo custo.

__7.__ Crie a classe FolhaDePagamento que contém os atributos mês e ano e os métodos:  
- totalAPagar(), que calcula o valor total a pagar (1 ponto)  
- imprimir(), que imprime todos os condutores e seus respectivos salários, bem como o total a pagar. (1 ponto)

>- Não criar as classes apropriadas (-1 ponto)  
>- Não utilizar a interface Veiculo (-1 ponto)  
>- Não fazer os encapsulamentos (-1 ponto)  
>- Não implementar a interface Comparable quando necessária (-1 ponto)  
>- Não criar restrições quando necessárias (-1 ponto)

Bons Estudos!

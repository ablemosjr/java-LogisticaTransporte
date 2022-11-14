
package logistica.model;

import java.util.List;

public class FolhaDePagamentos {
    
    private int mes;
    private int ano;
    
    public static void imprimir(List<Condutor> condutores, int mes, int ano) {
//        imprime todos os condutores e seus respectivos salários, bem como o total a pagar.
        //totalAPagar();
        if(mes > 0 && mes <= 12) {
            System.out.println("==============================");
            System.out.println(" <<  FOLHA DE PGTO "+ mes + "/" + ano + " >>");        
            System.out.println("------------------------------");

            for(Condutor condutor : condutores) {
                System.out.println("Nome = " + condutor.getNome() + 
                        "\nSalário = R$ " + format(condutor.getSalario()) + "\n");
            }

            System.out.println("------------------------------");
            System.out.println("Total a pagar = R$ " + format(totalAPagar(condutores)));
            System.out.println("==============================");        
        } else {
            System.out.println("Mês inválido!");
        }
    }
    
    private static double totalAPagar(List<Condutor> condutores) {
//        calcula o valor total a pagar
        double folhaPgto = 0;
        
        for(Condutor condutor : condutores) {
            folhaPgto += condutor.getSalario();
        }
        
        return folhaPgto;
    }    
    
    private static String format(double valor) {
        return String.format("%.2f", valor);
    }
}

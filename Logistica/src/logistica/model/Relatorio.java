
package logistica.model;

import java.util.Collections;
import java.util.List;

public class Relatorio {
    
    public static void imprimeCondutores(List<Condutor> c) {
//        imprimeCondutores() que imprime todos os condutores ordenados por cpf.
        Collections.sort(c);
        System.out.println(c);
    }
    
    public static void imprimeVeiculos(List<Veiculo> v) {
//        imprime todos os veículos de todos os tipos (moto, carro, caminhão) ordenados por nome
        Collections.sort(v, (v1, v2) -> {
            return v1.getNome().compareToIgnoreCase(v2.getNome());
        });
        System.out.println(v);
    }
    
    public static void imprimeViagens(List<Viagem> v) {
//        imprime todas as viagens ordenadas pelo custo
        Collections.sort(v);
        System.out.println(v);
    }

}

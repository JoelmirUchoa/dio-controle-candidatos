import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    //Imprimindo uma lista com os candidatos selecionados
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length; indice++) {
        System.out.println("O candidato de n°" + (indice+1) + " é o " + candidatos [indice]);
        }

        System.out.println("Forma abrevida de interação for each");

        for (String candidato: candidatos) {
        System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    //Selecionando candidatos
    static void selecaoCanditatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidatos " + candidato + " Solicitou este valor de salário " + salarioPretendido );
            if(salarioBase >= salarioPretendido) { 
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga"); 
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }   
    static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    //Analisando candidatos
    static  void analisarCanditato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditato");
        } else if( salarioBase == salarioPretendido) {
            System.out.println("Ligar para o canditato com contra proposta");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

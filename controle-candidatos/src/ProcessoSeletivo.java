import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCanditatos();
    }
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

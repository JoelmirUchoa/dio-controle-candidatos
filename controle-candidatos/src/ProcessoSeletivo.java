public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCanditato(1900.0);
        analisarCanditato(2200.0);
        analisarCanditato(2000.0);
    }
    static  void analisarCanditato(double salarioPretendito) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendito) {
            System.out.println("Ligar para o canditato");
        } else if( salarioBase == salarioPretendito) {
            System.out.println("Ligar para o canditato com contra proposta");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

public class CaixaEletronico{
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 17;

        if (valorSolicitado < saldo){ 
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo");

        }else
        System.out.println("Saldo insuficiente");
        System.out.println(saldo);    
    }    
}

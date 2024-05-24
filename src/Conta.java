import java.text.Format;

public abstract class Conta implements IConta {

    //atributo
    private   static  int SEQUENCIAL =1;
    private static final int AGENCIA_PADRAO = 1;
    protected Cliente cliente;
    protected int numero;
    protected int agencia;
    protected double saldo;


    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        saldo+= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.deposito(valor);
    }



    //getter e setter


    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimaExtrato(){
        System.out.println("Agencia: "+ agencia);
        System.out.println("nome do titular: "+ cliente.getNome());
        System.out.println("numero: "+ numero);
        System.out.println(String.format("saldo R$ %.2f", saldo));
    }
}

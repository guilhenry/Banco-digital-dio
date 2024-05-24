public interface IConta {

    void sacar(double valor);

    void deposito(double valro);

    void transferir(double valor, Conta destino);


}

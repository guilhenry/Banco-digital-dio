public class Main {
    public static void main(String[] args) {
        Cliente guilhreme = new Cliente();
        guilhreme.setNome("Guilherme");
        ContaCorrente cc = new ContaCorrente(guilhreme);
        ContaPoupanca poupanca = new ContaPoupanca(guilhreme);

        cc.deposito(5000);

        cc.transferir(1000,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

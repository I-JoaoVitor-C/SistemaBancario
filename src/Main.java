public class Main {
    public static void main(String[] args) {

        // ———ContaCorrente———

        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Ronaldo");
        cc.setSaldo(1000);
        cc.setLimite(500);

        // ———ContaPoupanca———

        ContaPoupanca cp = new ContaPoupanca();
        cp.setTitular("Nicolas Neto");
        cp.setSaldo(1200);
        cp.setTaxaRendimento(0.02);

        // ———Testes—a—mais———

        cc.sacar(1350);
        cp.renderJuros();
        cc.depositar(-1);
        cc.depositar(7.77);

        System.out.println("———Polimorfismo———");

        ContaBancaria[] contas = {cc, cp};
        for(ContaBancaria conta : contas) {
            System.out.println(conta.extrato());
        }
    }
}
public class ContaCorrente extends ContaBancaria {
    private double limite;

    // ↓ Fazendo o setter e getter do limite.
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // ↓ Sobrescrevendo o sacar().
    @Override
    public void sacar(double valor_saque) {
        if (valor_saque > 0 && valor_saque <= (getSaldo() + getLimite())) {
            setSaldo(getSaldo() - valor_saque);
            System.out.println("Saque de R$ " + valor_saque + " realizado com êxito — usando limite se necessário — por " + getTitular() + "!");
        }   else {
            System.out.println("Erro: valor do saque não pode ser negativo e não pode ultrapassar o valor do limite");
        }
    }

    // ↓ Sobrescrevendo o extrato()
    @Override
    public String extrato() {
        return "Titular: " + getTitular() + " | Saldo: R$ " + getSaldo() + " | Limite: R$ " + limite;
    }
}

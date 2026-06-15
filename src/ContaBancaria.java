public class ContaBancaria {
    private String titular;
    private double saldo;

    // ↓ Fazendo o setter e getter do titular.
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // ↓ Fazendo o setter e getter do saldo.
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }

    // ↓ Fazendo o metodo depositar, que tem que ser double.
    public void depositar(double valor_deposito) {
        if (valor_deposito > 0) {
            this.saldo += valor_deposito;
            System.out.println("Depósito de R$ " + valor_deposito + " realizado com êxito para " + titular + "!");
        }   else {
            System.out.println("Erro: valor para depositar deve ser positivo.");
        }
    }

    // ↓ Fazendo o metodo sacar, que tem que ser double.
    public void sacar(double valor_saque) {
        if (valor_saque > 0 && valor_saque <= saldo) {
            this.saldo -= valor_saque;
            System.out.println("Saque de R$ " + valor_saque + " realizado com êxito por " + titular + "!");
        } else {
            System.out.println("Erro: valor de saque não pode ser maior que o saldo.");
        }
    }

    // ↓ Fazendo o metodo extrato, que tem que ser String.
    public String extrato() {
        return "Titular: " + titular + " | Saldo: R$ " + saldo;
    }
}

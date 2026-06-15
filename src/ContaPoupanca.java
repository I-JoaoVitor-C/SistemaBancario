public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    // ↓ Fazendo o setter e o getter da taxaRendimento.
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // ↓ Fazendo o metodo renderJuros().
    public void renderJuros() {
        double novoSaldo = getSaldo() + (getSaldo() * taxaRendimento);

        setSaldo(novoSaldo);
    }

    // ↓ Sobrescrevendo o extrato().
    @Override
    public String extrato() {
        return "Titular: " + getTitular() + " | Saldo: R$ " + getSaldo()  + " | Taxa: " + taxaRendimento;
    }
}

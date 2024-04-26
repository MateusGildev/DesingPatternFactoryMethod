package boletobancario;

public abstract class Banco {

    protected abstract Boleto criarBoleto(int vencimento, double valor);

    public Boleto gerarBoleto(int vencimento, double valor) {

        Boleto boleto = this.criarBoleto(vencimento, valor);

        System.out.println("Boleto gerado com sucesso, com valor de R$"+valor);
        System.out.println("Valor Juros R$:"+boleto.calcularJuros());
        System.out.println("Valor Multa R$:"+boleto.calcularMulta());
        System.out.println("Valor Desconto R$:"+boleto.calcularDesconto());
        System.out.println("----------------------------------------------");

        return boleto;
    }
}

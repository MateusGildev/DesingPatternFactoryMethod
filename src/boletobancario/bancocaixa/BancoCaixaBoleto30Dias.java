package boletobancario.bancocaixa;

import boletobancario.Boleto;

public class BancoCaixaBoleto30Dias extends Boleto {

    public BancoCaixaBoleto30Dias(double valor) {
        this.valor=valor;
        this.juros = 0.05;
        this.desconto=0.05;
        this.multa=0.1;
    }
}

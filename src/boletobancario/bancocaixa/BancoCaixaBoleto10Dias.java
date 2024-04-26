package boletobancario.bancocaixa;

import boletobancario.Boleto;

public class BancoCaixaBoleto10Dias extends Boleto {

    public BancoCaixaBoleto10Dias(double valor) {
        this.valor=valor;
        this.juros = 0.02;
        this.desconto=0.1;
        this.multa=0.05;
    }
}

package boletobancario.bancocaixa;

import boletobancario.Boleto;

public class BancoCaixaBoleto60Dias extends Boleto {

    public BancoCaixaBoleto60Dias(double valor) {
        this.valor=valor;
        this.juros = 0.1;
        this.desconto=0;
        this.multa=0.2;
    }
}

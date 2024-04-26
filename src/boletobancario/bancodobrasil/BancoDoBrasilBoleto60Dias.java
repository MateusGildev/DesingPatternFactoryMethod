package boletobancario.bancodobrasil;

import boletobancario.Boleto;

public class BancoDoBrasilBoleto60Dias extends Boleto {

    public BancoDoBrasilBoleto60Dias(double valor){
        this.valor = valor;
        this.juros = 0.1;
        this.desconto = 0;
        this.multa = 0.15;
    }
}

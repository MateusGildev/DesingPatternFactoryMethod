package simplefactory;

import boletobancario.Banco;
import boletobancario.bancocaixa.BancoCaixa;
import boletobancario.bancodobrasil.BancoDoBrasil;

public class FactoryMethod_SimpleFactory {
    public static void main(String[] args) throws Exception {

        System.out.println("Banco Caixa -----------------------");
        Banco bancoCaixa = new BancoCaixa();
        bancoCaixa.gerarBoleto(10,100);
        bancoCaixa.gerarBoleto(30,100);
        bancoCaixa.gerarBoleto(60,100);

        System.out.println("Banco do Brasil ---------------------");
        Banco bancoBrasil = new BancoDoBrasil();
        bancoBrasil.gerarBoleto(10,100);
        bancoBrasil.gerarBoleto(30,100);
        bancoBrasil.gerarBoleto(60,100);
    }
}
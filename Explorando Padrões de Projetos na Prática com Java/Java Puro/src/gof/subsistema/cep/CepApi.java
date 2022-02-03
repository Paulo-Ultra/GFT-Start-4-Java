package gof.subsistema.cep;

import gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Ceilândia";
    }

    public String recuperarEstado(String cep) {
        return "DF";
    }
}


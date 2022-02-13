package com.projeto.no;

public class NoGenerico <T> {

    private T conteudo;
    private NoGenerico proximoNo = null;

    public NoGenerico (T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerico proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoGenerico{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "NoGenerico{" + conteudo + "}";

        if(proximoNo != null) {
            str += "->" + proximoNo.toString();
        }else {
            str += "->null";
        }
        return str;
    }
}



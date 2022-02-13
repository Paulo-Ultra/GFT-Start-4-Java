package com.projeto.filas;

public class NoRefatorado<T> {

    private T Object;
    private NoRefatorado<T> refNoRefatorado;

    public NoRefatorado() {
    }

    public NoRefatorado(T object){
        this.refNoRefatorado = null;
       this.Object = object;
    }

    public Object getObject() {
        return Object;
    }

    public void setObject(T object) {
        this.Object = object;
    }

    public NoRefatorado<T> getRefNoRefatorado() {
        return refNoRefatorado;
    }

    public void setRefNo(NoRefatorado refNoRefatorado) {
        this.refNoRefatorado = refNoRefatorado;
    }

    @Override
    public String toString() {
        String object;
        return "No{" +
                "object=" + Object +
                '}';
    }
}



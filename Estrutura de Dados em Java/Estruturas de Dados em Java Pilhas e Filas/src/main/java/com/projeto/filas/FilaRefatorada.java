package com.projeto.filas;

public class FilaRefatorada<T> {

    private NoRefatorado<T> refNoEntradaFila;

    public FilaRefatorada() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        NoRefatorado novoNoRef = new NoRefatorado(object);
        novoNoRef.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNoRef;
    }

    public T first() {
        if (!isEmpty()) {
            NoRefatorado primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNoRefatorado() != null) {
                    primeiroNo = primeiroNo.getRefNoRefatorado();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!isEmpty()) {
            NoRefatorado primeiroNo = refNoEntradaFila;
            NoRefatorado noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNoRefatorado() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoRefatorado();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoRefatorado noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]----->";
                if (noAuxiliar.getRefNoRefatorado() != null) {
                    noAuxiliar = noAuxiliar.getRefNoRefatorado();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }

        } else {
            stringRetorno += "null";
        }
        return stringRetorno;
    }
}


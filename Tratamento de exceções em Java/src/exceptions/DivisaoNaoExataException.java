package exceptions;

public class DivisaoNaoExataException extends Exception {

    private int denominador;
    private int numerado;

    public DivisaoNaoExataException(String message, int denominador, int numerado) {
        super(message);
        this.denominador = denominador;
        this.numerado = numerado;
    }
}

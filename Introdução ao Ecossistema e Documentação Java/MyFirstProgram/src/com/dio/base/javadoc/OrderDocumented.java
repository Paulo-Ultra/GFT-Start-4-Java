package com.dio.base.javadoc;

import java.math.BigDecimal;
/**
*@author Paulo Ricardo Freire Ultra
* @version 1.0.1
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class OrderDocumented {

    //Representa o código do pedido
    //O código está diferente da versão do professor para ser versionado no GitHub
    private final String codeOrder;
    private final BigDecimal totalVal;

    /**
     * Construtor da classe pedido
     * @param codeOrder     Código do Pedido
     * @param totalVal      Valor total do Pedido
     */

    public OrderDocumented (String codeOrder, BigDecimal totalVal) {
        this.codeOrder = codeOrder;
        this.totalVal = totalVal;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido.
     * Se valor foi maior que RS100,00 uma taxa será cobrada.
     * @return  Valor total dos pedidos com as taxas.
     * @throws RuntimeException Se o pedido for negativo.
     */
    public BigDecimal calculateFee() throws RuntimeException {
        if(this.totalVal.signum()<0) {
            throw new RuntimeException("O pedido tem valor negativo");
        }
        if(this.totalVal.compareTo(new BigDecimal(100.00)) > 100) {
            return this.totalVal.multiply(new BigDecimal(0.99));
        }
        return this.totalVal;
    }

}

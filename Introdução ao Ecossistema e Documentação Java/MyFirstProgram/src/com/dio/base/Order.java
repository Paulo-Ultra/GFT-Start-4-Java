package com.dio.base;

public class Order {

    private final String code;
    private final int totalValue;

    private String[] itens;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItens() {
        int i = 0;
        while (i < itens.length) {
            System.out.println(itens[i]);
            i++;
        }
    }


    public void printItens2() {
        int i = 0;
        do {
            System.out.println(itens[i]);
            i++;
        }while(i<itens.length);
        }
    }

    public void printItens3() {
        for (int i = 0; i < itens.length; i++);
            System.out.println(itens[i]);
    }

    public void printItens4() {
        for (String i : itens) {
            System.out.println(i);
        }
    }


    public double calculateFee() {

        if (totalValue > 100) {
            return totalValue * 0.99;
        } else {
            return totalValue;
        }

    }

    public double calculateFeeSwitch() {

        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }

    @Override
    public String toString(){
        return "Order={" + "code=" + "'"
                + code + "'" +
                "}";
    }

}

package com.bancodigitaloo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Banco {

    private String nome;
    private List<Conta> contas;

}

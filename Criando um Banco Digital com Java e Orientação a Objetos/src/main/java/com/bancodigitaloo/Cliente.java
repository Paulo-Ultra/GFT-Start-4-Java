package com.bancodigitaloo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Cliente {

     private Long id;
     private String nome;
     private Integer idade;
     private String email;

}

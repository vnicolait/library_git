package com.wtorr.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Cliente {

    private String nombre;
    private int edad;
    public static  void main(){
        List<Cliente> personas = List.of(
                new Cliente("Ana", 25),
                new Cliente("Luis", 17),
                new Cliente("Pedro", 30)
        );
        List<String> nombres=personas.stream().filter(n->n.getEdad()>18)
                .map(Cliente::getNombre).toList();
    }
}

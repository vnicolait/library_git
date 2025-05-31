package com.wtorr.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name="libros")
@Entity
public class Book {
    @Id
    private int isbn;
    private String titulo;
    private String tematica;
}

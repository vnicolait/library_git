package com.wtorr.library.repository;

import com.wtorr.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByTematica(String tematica);
}

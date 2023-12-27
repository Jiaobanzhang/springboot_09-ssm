package com.itheima;


import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
/**
 * @autor: 我亦无他，唯手熟尔
 */

public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(4);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

    @Test
    public void testdelete() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
        bookService.delete(2);
        List<Book> all2 = bookService.getAll();
        System.out.println(all2);
    }

}

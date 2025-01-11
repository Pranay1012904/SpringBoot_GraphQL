package com.springboot.graphQL.records;

import java.util.Arrays;
import java.util.List;

public record Book(
        Integer id,
        String name,
        Integer pageCount
) {
    public static List<Book> books= Arrays.asList(
            new Book(1,"Harry Potter", 234),
            new Book(2,"Harry Potter-2", 324),
            new Book(3,"Harry Potter-3", 524),
            new Book(4,"Harry Potter-4", 454)
    );
}

package org.example.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Book {
    private int bookId;
    private int authorId;
    private String title;
    private double price;
}

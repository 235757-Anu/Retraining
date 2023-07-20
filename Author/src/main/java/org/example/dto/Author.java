package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author
{
    private  int authorId;
    private  String authorName;
    private String gender;
    private  String authorEmail;
    private LocalDate joinDate;
}
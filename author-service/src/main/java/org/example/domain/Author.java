package org.example.domain;

public class Author {
    private String fullname;
    private String email;
    private String genre;

    public Author(String fullname, String email, String genre) {
        this.fullname = fullname;
        this.email = email;
        this.genre = genre;
    }
    public Author(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

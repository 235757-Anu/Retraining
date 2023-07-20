package org.example;

public class Spoken_languages
{
    private String iso_639_1;
    private String name;

    public String getIso_639_1() {
        return iso_639_1;
    }

    public String getName() {
        return name;
    }

    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spoken_languages(String iso_639_1, String name) {
        this.iso_639_1 = iso_639_1;
        this.name = name;
    }
}

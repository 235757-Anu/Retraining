package org.example;

public class Production_companies
{
    private int id;
    private String logo_path;
    private String name;
    private String origin_country;

    public int getId() {
        return id;
    }

    public String getLogo_path() {
        return logo_path;
    }

    public String getName() {
        return name;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public Production_companies(int id, String logo_path, String name, String origin_country) {
        this.id = id;
        this.logo_path = logo_path;
        this.name = name;
        this.origin_country = origin_country;
    }
}

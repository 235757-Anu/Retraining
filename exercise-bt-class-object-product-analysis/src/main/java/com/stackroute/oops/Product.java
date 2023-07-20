package com.stackroute.oops;

/*
    Product class stores the information about a single product.
    It contains parameterized constructor and Getters/Setters
 */
public class Product {

    public int productCode;
    public String name;
    public double price;
    public String category;

    public Product(int productCode, String name, double price, String category) {
        this.setProductCode(productCode);
        this.setName(name);
        this.setPrice(price);
        this.setCategory(category);
    }

    public int getProductCode()
    {
        return this.productCode;
    }

    public void setProductCode(int productCode)
    {
        this.productCode=productCode;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public String getCategory()
    {
        return this.category;
    }

    public void setCategory(String category)
    {
        this.category=category;
    }
}
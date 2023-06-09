/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Producto {
    private int id;
    private String name;
    private int category;
    private double price;
    private int aisle;
    private int bin;

    public Producto() {
    }

    public Producto(int id, String name, int category, double price, int aisle, int bin) {
        this.id = id;
        this.name = name;
        setCategory(category);
        setPrice(price);
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        if(this.category>=0&&category<=9){
        this.category = category;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price>0){
        this.price = price;
        }
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Id=" + id + " name=" + name + ", category=" + category + ", price=" + price + ", aisle=" + aisle + ", bin=" + bin + '}';
    }
    
    
}

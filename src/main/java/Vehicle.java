/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Vehicle  implements Comparable<Vehicle> {
    
    private String plaque;
    private String brand;
    private Person owner;

    public Vehicle(String plaque, String brand, Person owner) {
        this.plaque = plaque;
        this.brand = brand;
        this.owner = owner;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    @Override
    public String toString(){
        
        return "PLAQUE: "+plaque+"BRAND: "+brand+"OWNER: "+owner;
    }

    @Override
    public int compareTo(Vehicle o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Main {
    
    public static void main(String[] args) {
        
        Parking newparq = new Parking();
        
        Person p1 = new Person(12456, true);
        Vehicle car1 = new Vehicle("PQR456", "mazda", p1);
        
        Person p2 = new Person(1249876, false);
        Vehicle car2 = new Vehicle("PWR456", "kia", p2);
        
        Person p3 = new Person(432124, true);
        Vehicle car3 = new Vehicle("QQR456", "mazda", p3);
        
        Person p4 = new Person(564124, false);
        Vehicle car4 = new Vehicle("YQR456", "Hyundaai", p4);
        
        Person p5 = new Person(678124, true);
        Vehicle car5 = new Vehicle("WQR456", "mazda", p5);
        
        Person p6 = new Person(198024, false);
        Vehicle car6 = new Vehicle("YQR656", "kia", p6);
        
        Person p7 = new Person(164324, true);
        Vehicle car7 = new Vehicle("FWE456", "mazda", p7);
        
        Person p8 = new Person(10272824, false);
        Vehicle car8 = new Vehicle("VDR234", "mazda", p8);
        
        Person p9 = new Person(32462, true);
        Vehicle car9 = new Vehicle("TYU567", "kia", p9);
        
        Person p10 = new Person(97431, false);
        Vehicle car10 = new Vehicle("HGF345", "mazda", p10);
            
        newparq.addon(car1);
        newparq.addon(car2);
        newparq.addon(car3);
        newparq.addon(car4);
        newparq.addon(car5);
        newparq.addon(car6);
        newparq.addon(car7);
        newparq.addon(car8);
        newparq.addon(car9);
        newparq.addon(car10);
        
        System.out.println(newparq.getList().getFirst().getCar());
        
    }
}


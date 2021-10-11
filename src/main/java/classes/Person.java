/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Person {
    
    public String toString;
    private int id;
    private boolean affiliate;

    public Person(int id, boolean affiliate) {
        this.id = id;
        this.affiliate = affiliate;
    }

    public boolean isAffiliate() {
        return affiliate;
    }

    public void setAffiliate(boolean affiliate) {
        this.affiliate = affiliate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
       
        return "ID:"+id+"AFFILIATE: "+affiliate;
    }
    
    
     
}

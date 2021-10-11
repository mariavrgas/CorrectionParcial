/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Parking {
    
    private CircularDoubleList<Vehicle> list;

    
    public CircularDoubleList<Vehicle> getList() {
        return list;
    }

    public void setList(CircularDoubleList<Vehicle> list) {
        this.list = list;
    }
    
    public Node getRecent() {
        return recent;
    }

    public void setRecent(Node recent) {
        this.recent = recent;
    }
    
    public Parking(){
        
        list = new CircularDoubleList<Vehicle>();
        
        for(int i=0; i<10;i++){
            Vehicle spot = null;
            list.add(spot);  //only null
 
        }
        
    }
    
        private Node recent = null;
       
    public void addon(Vehicle run){
        
        Vehicle carro = run;
        
        if(recent==null){
            
            recent=list.getFirst(); 
        }
        
        Node currentRigth = Parking.this.getRecent();
        Node currentLeaft = Parking.this.getRecent();      
        
        for(int i = 0; i <=5 ; i++ ){

            if(currentRigth.getCar()==null /*currentRigth.getCar()=="Is empty"*/){

            	recent=currentRigth;
                recent.setCar(carro);
                return; 
            }  
            currentRigth=currentRigth.getNext();
            

            if(currentLeaft.getCar()==null /* currentLeaft.getCar()=="Is empty"*/){
            	recent=currentLeaft;
                recent.setCar(carro);
                return;
            }
             currentLeaft=currentLeaft.getPreviuos();
             
        }
               
        System.out.println("Parking is full");

    }
    

    public void deletebyPlaque(String plaque){
        
        Node comparate = list.getFirst();        
        String del = plaque;
        
        for(int i=0; i<=10;i++){
            Vehicle compar = (Vehicle) comparate.getCar();
            if(compar.getPlaque().equals(del) ){
            
               comparate.setCar(null);
               recent = comparate; 
               return; 
            }
        }
        System.out.println("that car  is not here");       
    }
    public void deletebyID(int id){
        
       Node comparateId = list.getFirst();
       int del = id;
       
       for (int i=0; i<=10; i++){
           Vehicle compar = (Vehicle) comparateId.getCar() ;
           Person people = compar.getOwner();
           if(people.getId() == del){
               comparateId.setCar(null);
               recent = comparateId;
               return;
           }
       }
        System.out.println("that car is not here");
    }
}

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
        
        Vehicle carro= run;
       
        if(recent==null){
        recent=list.getFirst();
        }   
        for(int i = 0; i <=5 ; i++ ){
            
            Node currentRigth = Parking.this.getRecent();
            Node currentLeaft = Parking.this.getRecent();
        
            if(currentRigth.getCar()==null || currentRigth.getCar()=="Is empty"){

            	recent=currentRigth;
                recent.setCar(run);
                return;
            }
            currentRigth=currentRigth.getNext();

            if(currentLeaft.getCar()==null || currentLeaft.getCar()=="Is empty"){
            	recent=currentLeaft;
                recent.setCar(run);
                return;
            }
             currentLeaft=currentLeaft.getPreviuos();
             
        }
               
        System.out.println("Parking is full");
/*
        if(reccent == null){
            
            
            recent = list.getFirst();
            
        }
        for(int i = 0; i <=5 ; i++ ){
      
            if(currentRigth.getCar() == null){
                recent = (Node) currentRigth.getCar();
                recent.setCar(run);
                return;
            }
            currentRigth = currentRigth.getNext();

            if(currentLeaft.getCar() == null){
                recent = (Node) currentLeaft.getCar();
                recent.setCar(run);
                return;
            }
            currentLeaft = currentLeaft.getPreviuos();
            
            System.out.println("Parking is full");
        }
    }*/

}}
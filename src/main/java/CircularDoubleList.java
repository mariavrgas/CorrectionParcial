/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 *//**
 *
 * @author Mafe
 *//**
 *
 * @author Mafe
 *//**
 *
 * @author Mafe
 */
public class CircularDoubleList <T extends Comparable<T>> implements IListable<T> {
    
    private Node<T> first;
    private Node<T> last;
    private Node<T> thisOne;

   public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public Node<T> getThisOne() {
        return thisOne;
    }

    public void setThisOne(Node<T> thisOne) {
        this.thisOne = thisOne;
    }
   
    
    public void print(){
        
        Node print = first;
        String cadena = " ";
        
        for(int i=0; i<10;i++){
            System.out.println(print.getCar());          
            print = print.getNext();
       
        }
        

    }

    @Override
    public void add(T item) {
        
        Node<T> actual = new Node<T>(item);
        
        if (first == null){
            first = actual;
            last = first;
         
        }else{
            last.setNext(actual);
            actual.setPreviuos(last);
            last = actual;
            last.setNext(first);
            first.setPreviuos(last);
        }
    
    
    }



    
    
    
    



    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_03_02;

//4)Bounded types

class MyArray<T extends Number>
{
    T A[]=(T[]) new Object[10];  //typecasing to generic array
    int length =0;
    
    public void append(T v){
        A[length++]=v;
}
    
    public void display(){
        for(int i=0; i<length ; i++){
            System.out.println(A[i]);
    }
    }
    
}



public class Generic_03_02 {

    public static void main(String[] args) {
        
       MyArray<Float> ma =new MyArray<>();
       
       ma.append(new Float(12.75f));
       ma.append(new Float(34.85f));
       
       ma.display();
       
        // TODO code application logic here
    }
    
}

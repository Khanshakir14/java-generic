/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_03_03;

class A{};
class B extends A{};
class c extends A{};

//4)Bounded types

class MyArray<T extends A>   //wether we want to implement from an interface, we would write "extend" here only  
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





public class Generic_03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArray<A> ma = new MyArray<>();
        
    }
    
}

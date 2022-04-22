/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_03_01;

/**
 *
 * @author shaha
 * 
 * 
 * 
 * 
 */


class MyArray<T>
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


class MyArray2<T> extends MyArray<T>{
    
}
public class Generic_03_01 {

    public static void main(String[] args) {
        MyArray2<String> ma = new MyArray2<>();
        ma.append("shakir");
        ma.append("Khan");
        
        ma.display();
    }
    
}

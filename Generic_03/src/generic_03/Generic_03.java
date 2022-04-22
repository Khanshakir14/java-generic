/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_03;


/*
1)No parameters
2)Multiple parameters  //it is allowed, would learn in future
3)subtypes
4)Bounded Types




*/
//no paramters- by default objecct is parameter
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


public class Generic_03 {

   
    public static void main(String[] args) {
        MyArray ma = new MyArray();   //when parameter is not given , it would take any object,
                                       //by default object class is parameter
        ma.append("Hi");
        ma.append(10);
        ma.append("Go");
        
        
        ma.display();
    }
    
}

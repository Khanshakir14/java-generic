/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_04_04;

/*

    LOWER BOUND



*/
class MyArray<T>
{
    T A[] = (T[]) new Object[10];
    int length =0;
    
    public void append (T v){
        A[length ++]= v;
        
    }
    
    public void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
    }
}
}

public class Generic_04_04 {

   static void fun(MyArray<? extends Number> obj)    //extends keyword is used for lower bound
           
                                    
                                    
   {
       obj.display();
   }
    
    public static void main(String[] args) {
       MyArray<String> ma1= new MyArray<>();
       ma1.append("Hi");
       ma1.append("Bye");
       
       
       MyArray<Integer> ma2 = new MyArray<>();
       ma2.append(10);
       ma2.append(20);
       
      // fun(ma1);  this would throw error as we have bounded the parameter in the function fun
       fun(ma2);
       
    }
    
}
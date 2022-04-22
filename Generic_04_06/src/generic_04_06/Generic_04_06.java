/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_04_06;
class A{}
class B extends A{}
class C extends A{}
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

public class Generic_04_06 {

   static void fun(MyArray<? extends A> obj)    //super keyword is used for upper bound
                                                //If I use <? super c> it will allow me to use A and B class types 
                                                // as A and B are super classes of C
                                    
                                    
   {
       obj.display();
   }
    
    public static void main(String[] args) {
       MyArray<B> ma1= new MyArray<>();
       
       
       MyArray<C> ma2 = new MyArray<>();
      
       
      fun(ma1);  
       fun(ma2);   
       
    }
    
}
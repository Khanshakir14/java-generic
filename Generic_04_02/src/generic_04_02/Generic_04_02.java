/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_04_02;



/*
   
 1_1)BOUND TYPE ON GENERIC METHODS
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

public class Generic_04_02 {

    static <E extends Number> void show(E[] list){     //for creating generic type method you should define it as generic By Placing <capital Alphabet> before 
                                        //Method is written as static, because only static methods can be called from main method
       for(E x: list){
           System.out.println(x);
       }
        
    }
    public static void main(String[] args) {
       // show(new String[]{"HI", "Go", "Bye"});  this will throw error because we have bounded the generic to allow classes which are inheriting from
       // Number class
        show(new Integer[]{10,20,30,40});
        show(new Float[]{12.5f, 34.76f});
       
    }
    
}

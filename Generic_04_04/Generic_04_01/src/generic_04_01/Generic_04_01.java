/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_04_01;
/*
in this lecture we would learn about
1) Generic Methods
2) WildCard
3)Lower Bound
4) Upper Bound


--> Generic Methods
Just like we were writing generic classes , we can also write generic methods




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

public class Generic_04_01 {

    static <E> void show(E[] list){     //for creating generic type method you should define it as generic By Placing <capital Alphabet> before 
                                        //Method is written as static, because only static methods can be called from main method
       for(E x: list){
           System.out.println(x);
       }
        
    }
    public static void main(String[] args) {
        show(new String[]{"HI", "Go", "Bye"});
        show(new Integer[]{10,20,30,40});
       
    }
    
}

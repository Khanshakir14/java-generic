/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic_01;

 /*
1) class Data
2) class MyArray

*/

class Data<T>  // class which is generic and stores only one object of any type 
                //it can support any type of object
{
private T obj;

public void setData(T v){   //setData is for setting the object
    obj = v;
}

public T getData(){ //getData is for retrieving the object 
    return obj;
}
    
}
public class Generic_01 {

   
    public static void main(String[] args) {
       Data<Integer> d= new Data<>();//Data<Integer> is written as Data<> 
       d.setData(10);  //auto boxing has taken place here , otherwise we need to write that as d.setData(new Integer(10));
       System.out.println(d.getData());
       
    }
    
}

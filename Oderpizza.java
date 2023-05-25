import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Pizza
{
    int p=300,N=450;
    int n;
    static int P=0;
    public Pizza()
    {}
    public void pizza()
    {

    }
    public Pizza(int n)
     {
        this.n=n;

     }
     
     void display()
     {
        if(n==1){
        System.out.println("1.Base Pizza veg = 300INR");
        System.out.println("Total: "+(P=(p+20)));
        }
        else if(n==2){
        System.out.println("2.Base Non veg = 450INR");
        System.out.println("Total: "+(P=(N+20)));
        }
    }

}
class deluxePizza extends Pizza
{
    int e;
    int x=150,y=100,E=0;
    public deluxePizza()
    {
       
    }
    public deluxePizza(int e)
    {
        super(P);
        this.e=e;
    }
    void info()
    
    {
        if(e==3){
            System.out.println("3.Extra Cheese = 150INR");
            System.out.println("Total: "+(E=(x+20)));
            }
            else if(e==4){
            System.out.println("4.Extra Topping = 100INR");
            System.out.println("Total: "+(E=(y+20)));
            }
            
        }
    void Total()
    
    {
        
        System.out.println("Total Oder:"+(P+E+20));
    }
}
public class Oderpizza {
    public static void main(String[] args)
    {
        int n=0,e=0;
        System.out.println("1.Base Pizza veg = 300INR");
        System.out.println("2.Base Non veg = 450INR");
        System.out.println("3.Extra Cheese = 150INR");
        System.out.println("4.Extra Topping = 100INR");
        System.out.println("Select your Pizza");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
         if(n==1)
         {
            System.out.println("Your choice is Base Pizza veg");
            Pizza pi1=new Pizza(n);
         }
         else if(n==2)
         {
            System.out.println("Your choice is Base Pizza Non veg");
            Pizza pi1=new Pizza(n);
         }
         else{
            System.out.println("Please enter valid number");
         }
       
        System.out.println("Select extra cheese and topping");
        System.out.println("Yes / No");
        boolean extra = sc.nextBoolean();
        if(extra==true){
        System.out.println("3.Extra Cheese = 150INR");
        System.out.println("4.Extra Topping = 100INR");
        e=sc.nextInt();
       
        if(e==3){
            System.out.println("Select extra cheese");
         if(extra==true)
        {
            System.out.println("Your choice is extra cheese");
            deluxePizza de1=new deluxePizza(e);
        }
        else
        {
            System.out.println("You  have no extra cheese");
        }

    }
    
    else if(e==4)
    {
        System.out.println("Select extra Topping");
        if(extra==true)
        {
            System.out.println("Your choice is extra Topping");
            deluxePizza de1=new deluxePizza(e);
        }
        else 
        {
            System.out.println("You  have no extra Topping");
        }
    }
       }
    else{
        System.out.println("You have no cheese and topping");
    }
    Pizza pi2=new Pizza(n);
    pi2.display();
    deluxePizza del2 = new deluxePizza(e);
    del2.info();
    del2.Total();
   }
}




    

    

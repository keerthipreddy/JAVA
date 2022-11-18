import java.util.*;
import java.math.*;
class Discriminant
{
   double a,b,c;
   Discriminant(double i,double j,double k)
   {
       a=i;
       b=j;
       c=k;
   }
double discr()
   {
       return(b*b-4*a*c);
   }
}
class Quadratic
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       double a,b,c;
       double r1,r2;
       System.out.println("Enter the coefficient of x^2");
       a=sc.nextInt();
       System.out.println("Enter the coefficient of x");
       b=sc.nextInt();
       System.out.println("Enter the constant");
       c=sc.nextInt();
       if (a==0)
       {
            System.out.println("Ented equation is not quadratic"); 
       }
       else 
       {
            Discriminant d=new  Discriminant(a,b,c);
            if(d.discr()>0)
            {
                    r1=(-b+Math.pow(d.discr(),0.5))/(2*a);
                    r2=(-b-Math.pow(d.discr(),0.5))/(2*a);
                    System.out.println("Roots are REAL AND DISTINCT : r1= "+r1+" r2="+r2);
            }
            else if(d.discr()<0)
            {
                   r1=b/(2*a);
                   r2=(Math.pow(Math.abs(d.discr()),0.5))/(2*a);
                   System.out.println("Roots are COMPLEX : r1="+r1+"+i"+r2+" r2="+r1+"-i"+r2); 
            }
            else
            {
                   r1=-b/(2*a);
                   System.out.println("Roots are EQUAL : r1=r2="+r1); 
            }
        }
     }
}



            
     

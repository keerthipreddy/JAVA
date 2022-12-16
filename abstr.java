import java.util.Scanner;
abstract class shape
{
           int a,b;
           abstract void printArea();
}

class rectangle extends shape
{
           void getdata(int x, int y)
           {
                       a=x;
                       b=y;
           }
           void printArea()
           {
                       double x=a*b;
                       System.out.println("\n Area of rectangle is\t"+x);
            }
}

class triangle extends shape
{
           void getdata(int x, int y)
           {
                       a=x;
                       b=y;
           }
           void printArea()
           {
                       double area=0.5*(a*b);
                       System.out.println("\n Area of triangle is\t"+area);
            }
}

class circle extends shape
{
           void getdata(int x)
           {
                       a=x;
           }
           void printArea()
           {
                       double area=3.14*a*a;
                       System.out.println("\n Area of circle is\t"+area);
            }
}

class abstr{
            public static void main(String args[])
            {
                       Scanner scan= new Scanner(System.in);
                       int choice;
                       shape s;
                       rectangle r= new rectangle();
                       triangle t= new triangle();
                       circle c= new circle();
                       System.out.println("\n 1.RECTANGLE \n 2.TRIANGLE \n 3.CIRCLE");
                       choice=scan.nextInt();
                       switch(choice)
                       {
                                      case 1:  System.out.println("\n Enter the length and breadth");
                                                   int l= scan.nextInt();
                                                   int b= scan.nextInt();
                                                   r.getdata(l,b);
                                                   r.printArea();
                                                   break;
                                      case 2:  System.out.println("\n Enter the base and height");
                                                   int b1= scan.nextInt();
                                                   int h= scan.nextInt();
                                                   t.getdata(b1,h);
                                                   t.printArea();
                                                   break;
                                      case 3:  System.out.println("\n Enter the radius");
                                                   int r1= scan.nextInt();
                                                   c.getdata(r1);
                                                   c.printArea();
                                                   break;
                                      default: System.out.println("\n Invalid choice");
                        }
             }
}



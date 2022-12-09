import java.util.*;
class Book{
               String title;
               String author;
               double price;
               int numPages;
	       
               Book()
              {
                  title="Default";
                  author="Default";
                  price=0.00;
                  numPages=0;
              }
         
             void setTitle(String t)
             {
                  title=t;
             }

             void setAuthor(String a)
             {
                  author=a;
             }

             void setPrice(double p)
             {
                  price=p;
             }

             void setPages(int np)
             {
                  numPages=np;
             }

              public String toString()
             {
                return title+"\t"+author+"\t"+price+"\t"+numPages+"\n";
             }
}

class BookDetails{
             public static void main(String args[])
             {
                   String t;
                   String a;
                   double p;
                   int np,n;
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter the no. of books");
                   n=sc.nextInt();

                   Book b[]=new Book[n];
                   for(int i=0;i<n;i++)
                   {
                       System.out.println("Enter the title of the book");
                       t=sc.next();
                       System.out.println("Enter the author of the book");
                       a=sc.next();
                       System.out.println("Enter the price of the book");
                       p=sc.nextDouble();
                       System.out.println("Enter the no. of pages in the book");
                       np=sc.nextInt();

                       b[i]=new Book();
                       b[i].setTitle(t);
                       b[i].setAuthor(a);
                       b[i].setPrice(p);
                       b[i].setPages(np);
                   }

                   System.out.println("Title"+"\t\t"+"Author"+"\t\t"+"Price"+"\t\t"+"Pages");
                   for(int i=0;i<n;i++)
                  {
                      System.out.println(b[i]);
                  }
             }
}

             
                   







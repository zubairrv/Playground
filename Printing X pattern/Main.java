import java.util.*;
class Main
{
 public static void main(String args[])
 { 
 int i,j,n;
 Scanner in = new Scanner(System.in);
     n = in.nextInt();
    
 for(i=(n/2)+1;i>=1;i--)
     {
         for(j=i;j<n/2+1;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=(2*i-1);j++)
         {
 if(j==1 || j==(2*i-1))
             System.out.print("*");
 else
          System.out.print(" ");
         }
         System.out.println("");
     } 
 for(i=2;i<=n/2+1;i++)
     {
         for(j=i;j<n/2+1;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=(2*i-1);j++)
         {
 if(j==1 || j==(2*i-1))
             System.out.print("*");
 else
          System.out.print(" ");
         }
         System.out.println("");
     } 
 }
}
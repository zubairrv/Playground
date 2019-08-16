import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
      int count1=0;
      for(int i=0;i<=arr_size-1;i++)
      {
        
        if((arr[i]==n1))
        {
          System.out.println(i);
          count1++;
        }
      } 
       if(count1==0)
         {
           System.out.println("-1");
         }
       int count=0;
       for(int i=0;i<=arr_size-1;i++)
       {    
        if((arr[i]==n2))
        {
          System.out.println(i);
          count++;
        }
       }
         if(count==0)
         {
           System.out.println("-1");
         }
}
}

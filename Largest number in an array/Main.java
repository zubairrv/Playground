import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int big;
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      big=arr[0];
      for(int i=1;i<=arr_size-1;i++)
      {
        if(big>=arr[i])
        {
          big=big;
        }
        else
        {
          big=arr[i];
        }
      }
      System.out.println(big);
    }
}

  
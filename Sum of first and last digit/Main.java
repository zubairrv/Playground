import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int first_number,sum;
      int last_digit=number%10;
      while(number>=10)
      {
        number=number/10;
      }
      first_number=number;
      sum=first_number+last_digit;
      System.out.println(sum);
    
     
	}
}
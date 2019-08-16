import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
       char ch=in.next().charAt(0);
       int key=in.nextInt();
       if(ch>='a'&&ch<='z')
       {
         int offset=ch-'a';
         offset=((offset-key)%26);
         ch=(char)('z'-offset-1);
       }
        if(ch>='A'&&ch<='Z')
       {
         ch=(char)(ch-'A');
         ch=(char)((ch-key)%26);
         ch=(char)(ch+'A');
       }
      System.out.println(ch);
         
    }
}
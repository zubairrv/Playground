class MyModel1 {
     int Camera;
     String Lock;
  int Display;
  public void setfeatures(int Camera,String Lock,int Display)
  {
    this.Camera=Camera;
    this.Lock=Lock;
    this.Display=Display;
  }
}
class MyModel2 extends MyModel1 
{

}
class MyModel2T extends MyModel2 {

}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel1 obj1=new MyModel1();
          MyModel2 obj2=new MyModel2();
          MyModel2T obj3=new MyModel2T();
      obj1.setfeatures(2,"Nolock",5);
       obj2.setfeatures(5,"Fingerprint",5);
       obj3.setfeatures(16,"Fingerprint",6);
  System.out.println("Features of MyModel 1\nCamera mega pixels: "+obj1.Camera+"\nFeatures of MyModel 2\nCamera mega pixels: "+obj2.Camera+"\nLock mechanism: "+obj2.Lock+"\nDisplay size: "+obj2.Display+"\nFeatures of MyModel 2T\nCamera mega pixels: "+obj3.Camera+"\nLock mechanism: "+obj3.Lock+"\nDisplay size: "+obj3.Display);
    }
}
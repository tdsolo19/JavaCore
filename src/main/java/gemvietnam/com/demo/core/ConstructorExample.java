package gemvietnam.com.demo.core;

 public class ConstructorExample {

  public ConstructorExample() {

  }
  public ConstructorExample(String a) {
   System.out.println("hello constructor");
  }

  public ConstructorExample (String a, int b, int c) {

  }

  public static void main(String[] args) {
   ConstructorExample constructorExample = new ConstructorExample();
   ConstructorExample jav = new ConstructorExample("sssss", 87,70);
  }
 }

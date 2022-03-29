package effective_java.item1;

public interface StaticInterfaceClass extends Runnable {

  int a = 10;

  static StaticInterfaceClass factoryMethod() {

    callablePrivateMethod();

    return new StaticInterfaceClass() {
      @Override
      public void run() {
        System.out.println("check");
      }

      @Override
      public int hashCode() {
        return super.hashCode();
      }
    };
  }

  private static void callablePrivateMethod() {
    System.out.println("Callbale static private Method called");
  }

  class InnerClass {


    int b = 10;

    static void helloWorld() {
      System.out.println("Hello World");
    }
  }

}

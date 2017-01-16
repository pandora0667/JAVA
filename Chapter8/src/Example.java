/**
 * Created by jusk2 on 2017-01-17.
 */
public class Example {
  public static void main(String[] args) {
    ImplementationC implementationC = new ImplementationC();

    InterfaceA ia = implementationC;
    ia.methodA(); // InterfaceA 변수는 methodA()만 호출가능
    System.out.println();

    InterfaceB ib = implementationC;
    ib.methodB(); // InterfaceB 변수는 methodB()만 호출가능
    System.out.println();

    InterfaceC ic = implementationC;  // InterfaceC 변수는 methodA, methodB, methodC 모두 호출 가능
    ic.methodA();
    ic.methodB();
    ic.methodC();
  }
}

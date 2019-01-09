package chapter05;

/**
 * ClassName: OrderOfInitalization <br/>
 * Function: 构造器初始化. <br/>
 * date: 2018年12月12日 下午6:46:37 <br/>
 * 
 * @author hanxiaoming
 * @version
 */
public class OrderOfInitalization {
  public static void main(String[] args) {
    House house = new House();
    house.f();
  }
}


class Window {
  public Window(int market) {
    System.out.println("window(" + market + ")");
  }
}


class House {
  Window w1 = new Window(1);

  public House() {
    System.out.println("House()");
    w3 = new Window(33);
  }

  Window w2 = new Window(2);

  void f() {
    System.out.println("f()");
  }

  Window w3 = new Window(3);
}

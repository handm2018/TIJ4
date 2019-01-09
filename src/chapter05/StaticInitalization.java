package chapter05;

/**
 * ClassName: StaticInitalization <br/>
 * Function: 静态数据初始化. <br/>
 * date: 2018年12月13日 上午9:17:36 <br/>
 * 
 * @author hanxiaoming
 * @version
 */
public class StaticInitalization {
  static Cupboard cupboard = new Cupboard();
  static Table table = new Table();

  public static void main(String[] args) {
    System.out.println("Creating cupboard");
    new Cupboard();
    table.f2(1);
    cupboard.f3(1);
  }
}


class Bowl {

  public Bowl(int market) {
    System.out.println("Bowl(" + market + ")");
  }

  void f1(int market) {
    System.out.println("f1(" + market + ")");
  }
}


class Table {
  static Bowl bowl1 = new Bowl(1);

  public Table() {
    System.out.println("Table()");
    bowl2.f1(1);
  }

  void f2(int market) {
    System.out.println("f2(" + market + ")");
  }

  static Bowl bowl2 = new Bowl(2);
}


class Cupboard {
  Bowl bowl3 = new Bowl(3);
  static Bowl bowl4 = new Bowl(4);

  public Cupboard() {
    System.out.println("Cupboard()");
    bowl4.f1(2);
  }

  void f3(int market) {
    System.out.println("f3(" + market + ")");
  }

  static Bowl bowl5 = new Bowl(5);
}



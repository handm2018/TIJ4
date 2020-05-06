package chapter13_collections.set;

/**
 *@program: TIJ4
 *@description: HashCode的简单认识
 *@author: 韩东明
 *@date: 2020/05/06 10:28
 */
public class HashCodeDemo {

    public static void main(String[] args) {
        /**
         * hashCode：
         *      object类中的hashCode()方法得到一个int类型的值，这一般是通过将该对象的内部地址转换成一个整数来实现的
         *      public int hashCode()
         *          1. 两个对象是相等的，那么对这两个对象中的每个对象调用 hashCode 方法都必须生成相同的整数结果
         *          2. hashCode值相等，拉个对象不一定相同
         *          3. 同一对象多次调用hashCode()方法，返回的hashCode值相同
         */

        Student student1 = new Student("王祖贤", 23);
        Student student2 = new Student("林青霞", 24);
        System.out.println(student1.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        // 重写hashCode方法，可以控制返回的哈希值
        System.out.println("-------------");

    }


}

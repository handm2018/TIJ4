package chapter17_string;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    @Override
    public String toString() {
//        return "InfiniteRecursion address :" + this + "\n";   产生无意识的递归，应该用super.toString()
        return "InfiniteRecursion address :" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> infiniteRecursionList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            infiniteRecursionList.add(new InfiniteRecursion());
        }
        System.out.println(infiniteRecursionList);
    }
}

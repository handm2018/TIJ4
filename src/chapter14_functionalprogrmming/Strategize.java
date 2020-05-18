package chapter14_functionalprogrmming;

/**
 *@program: TIJ4
 *@description: 函数式编程新旧对比
 *@author: 韩东明
 *@date: 2020/05/15 09:55
 */
public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return null;
                    }
                },
                msg -> msg.substring(0, 5),
                Unrelated::twice
        };
        Strategize s = new Strategize("Hello There");
        s.communicate();
        for (Strategy strategy : strategies) {
            s.changeStrategy(strategy);
            s.communicate();
        }
    }

}

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}



package chapter10.factory.game;

/**
 * ClassName: Checkers <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月18日 下午3:20:33 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Checkers implements Game {

    private Checkers() {}

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move" + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };


}

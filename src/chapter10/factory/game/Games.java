package chapter10.factory.game;

/**
 * ClassName: Games <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2019年1月18日 下午3:41:44 <br/>
 * 
 * @author handm2018@126.com
 * @version
 */
public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        boolean move = s.move();
        while (move) {
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        playGame(Chess.factory);
        playGame(Checkers.factory);
    }
}

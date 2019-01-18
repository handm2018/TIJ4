package chapter10.factory.game;
/** 
 * ClassName: Chess <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2019年1月18日 下午3:34:33 <br/> 
 * 
 * @author handm2018@126.com 
 * @version  
 */
public class Chess implements Game {
    
    private Chess() {}
    
    private int moves=0;
    private static final int MOVES=4;

    @Override
    public boolean move() {
        System.out.println("Chess move"+moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

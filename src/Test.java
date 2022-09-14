public class Test extends Game{
    public static void main(String[] args) {

        Game game = new Game();
        game.game();
        System.out.println("电脑的骰子状态是：");
                game.rule(game.getA1(), game.getA2(), game.getA3());
        System.out.println("你的骰子状态是：");
                game.rule(game.getB1(), game.getB2(), game.getB3());


    }
}

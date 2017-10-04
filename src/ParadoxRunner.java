import com.mariana.game.Game;
import com.mariana.game.Player;
import com.mariana.game.Statistics;

/**
 * Created by nicot on 10/4/2017.
 */
public class ParadoxRunner {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        for (Integer i = 0; i < 1000; i++) {
            Game game = new Game();
            Player player = new Player();
            game.setTracker(statistics);
            game.hideCar();
            game.acceptFirstAnswer(player.chooseDoor());
            player.seeOpenedDoor(game.openOneDoor());
            game.acceptSecondAnswer(player.doNotChangeMind());
        }
        System.out.println(statistics.getStatistics());
    }
}

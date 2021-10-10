package racinggame;

/**
 * Created By bohyun on 2021/10/09
 */
public class RacingGameController {
    RacingGameView view = new RacingGameView();
    RacingGameModel model = new RacingGameModel();

    public String[] racingStart() {
        return view.racingStart();
    }

    public void racing(String[] racingInfo) {
        String[] racing_cars = racingInfo[0].split(",");
        int racing_turn = Integer.valueOf(racingInfo[1]);

        for (int i = 0; i < racing_turn; i++) {

        }
    }
}

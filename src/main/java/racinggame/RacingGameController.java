package racinggame;

import java.util.List;

/**
 * Created By bohyun on 2021/10/09
 */
public class RacingGameController {
    RacingGameView view = new RacingGameView();
    RacingGameModel model = new RacingGameModel();

    public String[] racingStart() {
        return view.racingStart();
    }

    public RacingScore racing(String[] racingInfo) {
        return model.racing(racingInfo);
    }

    public List<String> racingFinish(RacingScore racing) {
        return model.racingFinish(racing);
    }

    public void announcedWinner(List<String> winners) {
        view.announcedWinner(winners);
    }
}

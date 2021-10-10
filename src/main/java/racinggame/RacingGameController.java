package racinggame;

import java.util.List;

/**
 * Created By bohyun on 2021/10/09
 */
public class RacingGameController {
    RacingGameView view = new RacingGameView();
    RacingGameModel model = new RacingGameModel();

    public String[] inputParticipateRacingCar() {
        return view.getParticipateRacingCar();
    }

    private String inputRacingTurn() {
        return view.getRacingTurn();
    }

    public void racingPlay(String[] racingCars) {
        try {
            this.checkCarName(racingCars);
            String racingTurn = this.inputRacingTurn();
            RacingScore racing = this.racing(racingCars, racingTurn);
            List<String> winners = this.racingFinish(racing);
            this.announcedWinner(winners);
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
            racingCars = this.inputParticipateRacingCar();
            racingPlay(racingCars);
        }
    }

    private RacingScore racing(String[] racingCars, String racingTurn) {
        return model.racing(racingCars, racingTurn);
    }

    private void checkCarName(String[] racingCars) {
        model.checkCarName(racingCars);
    }

    private List<String> racingFinish(RacingScore racing) {
        return model.racingFinish(racing);
    }

    private void announcedWinner(List<String> winners) {
        view.announcedWinner(winners);
    }
}

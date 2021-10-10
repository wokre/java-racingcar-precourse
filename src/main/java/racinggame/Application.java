package racinggame;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        RacingGameController controller = new RacingGameController();

        String[] racingInfo = controller.racingStart();
        RacingScore racing = controller.racing(racingInfo);
        List<String> winners = controller.racingFinish(racing);
        controller.announcedWinner(winners);
    }
}

package racinggame;

public class Application {

    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        RacingGameController controller = new RacingGameController();

        String[] participateRacingCar = controller.inputParticipateRacingCar();
        controller.racingPlay(participateRacingCar);
    }
}

package racinggame;

import nextstep.utils.Console;

import java.util.List;

/**
 * Created By bohyun on 2021/10/09
 */
public class RacingGameView {

    public String[] racingStart() {
        RacingGameController controller = new RacingGameController();
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racing_car = Console.readLine();
        System.out.println("시도할 회수는 몇회인가요?");
        String racing_turn = Console.readLine();
        return new String[]{racing_car, racing_turn};
    }

    public void announcedWinner(List<String> winners) {
        String win = String.join(",", winners);
        System.out.println("최종 우승자는" + win + " 입니다.");
    }
}

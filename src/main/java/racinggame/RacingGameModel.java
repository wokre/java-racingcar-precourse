package racinggame;

import nextstep.utils.Randoms;

import java.util.*;

/**
 * Created By bohyun on 2021/10/09
 */
public class RacingGameModel {
    private static final String ERROR_MESSAGE = "[ERROR]";

    public RacingScore racing(String[] racingCars, String racingTurn) {
        int racing_turn = Integer.valueOf(racingTurn);

        Map<String, String> scoreInitialize = scoreInitialize(racingCars);
        RacingScore racingScore = new RacingScore(scoreInitialize);

        for (int i = 0; i < racing_turn; i++) {
            racingScore = getRacingScore(racingCars, racingScore);
        }
        return racingScore;
    }

    private RacingScore getRacingScore(String[] racingCars, RacingScore racingScore) {
        Map<String, String> scoreMap = racingScore.getRacingScore();
        for (String car : racingCars) {
            String score = scoreMap.get(car);
            int num = Randoms.pickNumberInRange(0, 9);
            score = goOrStop(score, num);
            scoreMap.put(car, score);
            System.out.println(car + " : " + score);
        }
        racingScore = new RacingScore(scoreMap);
        return racingScore;
    }

    private String goOrStop(String score, int num) {
        if (num >= 4) {
            score += "-";
        }
        return score;
    }

    private Map<String, String> scoreInitialize(String[] racingCars) {
        Map<String, String> map = new HashMap<>();
        for (String car : racingCars) {
            map.put(car, "");
        }
        return map;
    }

    public List<String> racingFinish(RacingScore racing) {
        Map<String, String> racingScore = racing.getRacingScore();
        Iterator<String> keys = racingScore.keySet().iterator();
        int max = Collections.max(racingScore.values()).length();
        List<String> result = new ArrayList<>();
        while (keys.hasNext()) {
            getWinner(racingScore, keys, max, result);
        }
        return result;
    }

    private void getWinner(Map<String, String> racingScore, Iterator<String> keys, int max, List<String> result) {
        String key = keys.next();
        int move = racingScore.get(key).length();
        if (max == move) {
            result.add(key);
        }
    }

    public void checkCarName(String[] racingCars) {
        for (String s : racingCars) {
            checkCarNameLength(s);
        }
    }
    private void checkCarNameLength(String car) {
        if (car.trim().length() > 5) {
            System.out.println(car);
            throw new NoSuchElementException(ERROR_MESSAGE);
        }
    }
}

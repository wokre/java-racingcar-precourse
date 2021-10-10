package racinggame;

import java.util.Map;

/**
 * Created By bohyun on 2021/10/10
 */
public class RacingScore {

    private final Map<String, String> rankByCars;

    public RacingScore(Map<String, String> rankByCars) {
        this.rankByCars = rankByCars;
    }

    public Map<String, String> getRacingScore() {
        return rankByCars;
    }
}

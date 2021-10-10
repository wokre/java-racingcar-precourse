package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.doesNotHave;

/**
 * Created By bohyun on 2021/10/10
 */
class RacingGameModelTest {

    @Test
    void map_update_test() {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put("t1", "--");
        map.put("t2", "-");
        map.put("t3", "");

        map.put("t1", "---");
        map.put("t2", "----");
        map.put("t3", "--");

        System.out.println(map);
    }

    @Test
    void map_extract_max() {
        Map<String, String> map = new HashMap<>();
        map.put("t1", "---");
        map.put("t2", "----");
        map.put("t3", "");
        map.put("t4", "----");

        int max_length = Collections.max(map.values()).length();
        int min_length = Collections.min(map.values()).length();
        Assertions.assertEquals(4, max_length);
        Assertions.assertEquals(2, min_length);
    }

    @Test
    void list_to_str() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("t" +i);
        }
        System.out.println(list);
        String s = String.join(", ", list);
        System.out.println(s);
    }

    @Test
    void check_str_length() {
        String str = "javaji";
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> {
           if (str.length() > 6) throw new NoSuchElementException("ERROR");
        });
    }

    @Test
    void test_exception() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            cnt += i;
            if (i == 4) {
                throw new IllegalArgumentException();
            }
        }
        System.out.println("count >>>>>>>>>>>>>>>>>>>> " + cnt);
    }
}
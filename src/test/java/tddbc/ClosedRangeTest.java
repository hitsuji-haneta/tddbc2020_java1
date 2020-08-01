package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

public class ClosedRangeTest {

    @Nested
    class 上端点より下端点が大きい閉区間を作ることはできない {
        @Test
        public void 下端点が上端点より大きい場合はエラー() throws Exception {
            assertThrows(IllegalArgumentException.class, () -> new ClosedRange(3, 2));
        }
    }

}

package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ClosedRangeTest {

    @Nested
    class 上端点より下端点が大きい閉区間を作ることはできない {
        @Test
        public void 上端点より下端点が大きい場合はエラー() throws Exception {
            assertThrows(IllegalArgumentException.class, () -> new ClosedRange(3, 2));
        }
    }

    @Nested
    class contanisメソッドは与えられた一つの整数が区間に含まれるかを判定する {
        @Test
        public void 引数5は3_8区間に含まれるのでTrueとなる() throws Exception {
        	ClosedRange closedRange = new ClosedRange(3, 8);
        	boolean result = closedRange.contains(5);
        	assertEquals(result, true);
        }
    }



}

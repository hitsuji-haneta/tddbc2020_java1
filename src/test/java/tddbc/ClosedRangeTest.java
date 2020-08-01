package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
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
        private ClosedRange closedRange;
        
        @BeforeEach
        public void 前処理() {
        	closedRange = new ClosedRange(3, 8);
        }

        @Test
        public void 引数5は3_8区間に含まれるのでTrueとなる() throws Exception {
        	boolean result = closedRange.contains(5);
        	assertEquals(result, true);
        }

        @Test
        public void 引数2は3_8区間に含まれないのでFalseとなる() throws Exception {
        	boolean result = closedRange.contains(2);
        	assertEquals(result, false);
        }
    }



}

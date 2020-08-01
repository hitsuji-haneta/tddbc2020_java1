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
            assertEquals(true, result);
        }

        @Test
        public void 引数2は3_8区間に含まれないのでFalseとなる() throws Exception {
            boolean result = closedRange.contains(2);
            assertEquals(false, result);
        }
    }

    @Nested
    class 区間オブジェクト同士が比較できる {
        private ClosedRange closedRange;

        @BeforeEach
        public void 前処理() {
            closedRange = new ClosedRange(3, 8);
        }

        @Test
        public void _3_8区間と3_8区間は等価である() throws Exception {
            // 実行
            boolean result = closedRange.equals(new ClosedRange(3, 8));
            // 検証
            assertEquals(true, result);
        }

        @Test
        public void _3_8区間と3_7区間は等価でない() throws Exception {
            // 実行
            boolean result = closedRange.equals(new ClosedRange(3, 7));
            // 検証
            assertEquals(false, result);
        }
    }

    @Nested
    class コンストラクタがあって下端点と上端点を受け取る {
        private ClosedRange closedRange;

        @BeforeEach
        public void 前処理() {
            closedRange = new ClosedRange(3, 8);
        }

        @Test
        public void 閉区間3_8のとき上端点が8である() {
            int result = closedRange.topPoint();
            assertEquals(8, result);
        }

        @Test
        public void 閉区間3_8のとき下端点が3である() {
            int result = closedRange.bottomPoint();
            assertEquals(3, result);
        }
    }

    @Nested
    class 区間オブジェクトが包含されていることを確認できる {
        private ClosedRange range3_8;

        @BeforeEach
        public void 前処理() {
            range3_8 = new ClosedRange(3, 8);
        }

        @Test
        public void _4_8区間は3_8区間に含まれている() throws Exception {
            // 実行
            boolean result = range3_8.containsAll(new ClosedRange(4, 8));
            // 検証
            assertEquals(true, result);
        }

        @Test
        public void _2_8区間は3_8区間に含まれている() throws Exception {
            // 実行
            boolean result = range3_8.containsAll(new ClosedRange(2, 8));
            // 検証
            assertEquals(false, result);
        }

        @Test
        public void _3_9区間は3_8区間に含まれている() throws Exception {
            // 実行
            boolean result = range3_8.containsAll(new ClosedRange(3, 9));
            // 検証
            assertEquals(true, result);
        }
    }

}

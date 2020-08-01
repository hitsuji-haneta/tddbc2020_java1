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
        @Test
        public void _3_8区間と3_8区間は等価である() throws Exception {
        	// 準備
        	// 実行
        	boolean result = new ClosedRange(3, 8).equals(new ClosedRange(3, 8));
        	// 検証
        	assertEquals(true, result);
        }

         @Test
         public void _3_8区間と3_7区間は等価でない() throws Exception {
         	// 準備
         	// 実行
         	boolean result = new ClosedRange(3, 8).equals(new ClosedRange(3, 7));
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
            int result = closedRange.getTopPoint();
            assertEquals(8, result);
        }
        @Test
        public void 閉区間3_8のとき下端点が3である() {
            int result = closedRange.getBottomPoint();
            assertEquals(3, result);
        }
    }
}

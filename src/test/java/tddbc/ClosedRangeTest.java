package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClosedRangeTest {

    @Test
    public void 下端点が上端点より大きい場合はエラー() throws Exception {
//    	ClosedRange closeRange = new ClosedRange(3, 2);
    	assertThrows(IllegalArgumentException.class, () -> new ClosedRange(3, 2));
    }

}

package tddbc;

public class ClosedRange {
  private int _bottomPoint;
  private int _topPoint;

  public ClosedRange(int bottomPoint, int topPoint) {
    if (bottomPoint > topPoint) {
      throw new IllegalArgumentException("下端点が上端点より大きいです。");
    }
    _bottomPoint = bottomPoint;
    _topPoint = topPoint;
  }

public boolean contains(int i) {
	return true;
}
}
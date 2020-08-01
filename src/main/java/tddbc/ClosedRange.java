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

  public boolean contains(int num) {
    if(_bottomPoint <= num && num <= _topPoint) {
      return true;
    }
    return false;
  }

  public boolean equals(ClosedRange cr) {
	if(_bottomPoint == cr.getBottomPoint() && _topPoint == cr.getTopPoint()) return true;
    return false;
  }

public int getTopPoint() {
	return _topPoint;
}

public int getBottomPoint() {
	return _bottomPoint;
}
}
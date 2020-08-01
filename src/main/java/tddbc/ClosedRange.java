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
    if (_bottomPoint <= num && num <= _topPoint) {
      return true;
    }
    return false;
  }

  public boolean equals(ClosedRange other) {
    if (_bottomPoint != other.bottomPoint()) return false;
    if (_topPoint != other.topPoint()) return false;
    return true;
  }

  public int topPoint() {
    return _topPoint;
  }

  public int bottomPoint() {
    return _bottomPoint;
  }

  public boolean containsAll(ClosedRange other) {
    if (_bottomPoint > other.bottomPoint()) return false;
    // if (_topPoint < other.topPoint()) return false;
    return true;
  }
}
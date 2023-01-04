import static java.lang.Math.max;
import static java.lang.Math.min;
public class BoundaryInterval implements Interval {
    int leftBoundary;
    int rightBoundary;
    public BoundaryInterval(int lb, int rb) {
        leftBoundary = lb;
        rightBoundary = rb;
    }
    public int getSmallestElement() {
        return leftBoundary;
    }
    public int getLargestElement() {
        return rightBoundary;
    }
    public Interval intersect(Interval r){
                int lb = max(leftBoundary, r.getSmallestElement());
                int rb = min(rightBoundary, r.getLargestElement());
    if(lb<rb) return new BoundaryInterval(lb,rb);
    else return new BoundaryInterval(0,0);
    }
}

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
                int nlb = max(leftBoundary, r.getSmallestElement());
                int nrb = min(rightBoundary, r.getLargestElement());
    if(nlb>=nrb) return new BoundaryInterval(nlb,nrb);
    else return new BoundaryInterval(0,0);
    }
}

/** an integer interval represented by an array */
import static java.lang.Math.max;
import static java.lang.Math.min;

public class ArrayInterval implements Interval {
    private int[] boundary;

    public ArrayInterval (int[] boundary) {
        this.boundary = new int[]{boundary[0], boundary[1]};
    }

    public int getSmallestElement(){ return boundary[0]; }
    public int getLargestElement() { return boundary[1]; }

    public Interval intersect(Interval r) {
        int nlb = max(boundary[0], r.getSmallestElement());
        int nrb = min(boundary[1], r.getLargestElement());
        if (nlb <= nrb) return new ArrayInterval(new int[]{max(boundary[0], r.getSmallestElement()), min(boundary[1], r.getLargestElement())});
        else return new ArrayInterval(new int[]{0, 0});
    }
}
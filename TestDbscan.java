import junit.framework.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.HashSet;

public class TestDbscan extends TestCase {
    Dbscan d;
    ArrayList<Point> p;


    public void setUp() {
        d = new Dbscan();
        p = new ArrayList<Point>();
        p.add(new Point(3, 5));
        p.add(new Point(3, 7));
        p.add(new Point(8, 5));
        p.add(new Point(6, 9));
        p.add(new Point(2, 3));
        p.add(new Point(1, 2));
        p.add(new Point(2, 1));
        p.add(new Point(1, 1));
        d.setDataset(p);
        d.setEps(1);
        d.setMinPts(2);
    }

    public void testVisit() {
        d.visit(p.get(0));
        HashSet <Point> visited = new HashSet<Point>();
        visited.add(p.get(0));
        HashSet <Point> unvisited = new HashSet<Point>(p);
        unvisited.remove(p.get(0));
        assertEquals(d.getVisited(), visited);
        assertEquals(d.getUnvisited(), unvisited);
    }

    public void testRegionQuery() {
        ArrayList <Point> n1 = d.regionQuery(p.get(1));
        ArrayList <Point> n2 = d.regionQuery(p.get)
    }
}

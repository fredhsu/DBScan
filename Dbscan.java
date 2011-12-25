import java.util.*;

public class Dbscan {
    ArrayList <Point> dataset;
    HashSet <Point> visited;
    HashSet <Point> unvisited;
    double eps;
    int minPts;

    public Dbscan() {
        dataset = new ArrayList<Point>();
        visited = new HashSet<Point>();
        unvisited = new HashSet<Point>();
        eps = 0;
        minPts = 0;
    }

    public Dbscan instanceOf() {
        return this;
    }

    public void setEps(double x) {
        eps = x;
    }

    public void setMinPts(int x){
        minPts = x;
    }

    public ArrayList <Point> regionQuery (Point core) {
        ArrayList <Point> result = new ArrayList <Point> ();
        for(Point p : dataset) {
            double dist = Point.distance(core, p);
            if(dist <= eps && p != core) {
                result.add(p);
            }
        }
        return result;
    }

    public void setDataset(ArrayList<Point> p) {
        dataset = p;
        unvisited = new HashSet<Point>(dataset);
        visited.clear();
    }

    public HashSet <Point> getUnvisited() {
        return unvisited;
    }

    public HashSet <Point> getVisited() {
        return visited;
    }

    public void visit(Point p) {
        visited.add(p);
        unvisited.remove(p);
    }

}

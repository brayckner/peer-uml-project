
import java.util.*;


public class Vertex {
    private int nodeID;
    private Transform relativeTransform =new Transform();
    private List<Vertex> links;

    public int getID() {
        return this.nodeID;
    }
    public int setID(int i) {
        return this.nodeID = i;
    }
    public Transform transform()
    {
        return relativeTransform;
    }
    public List<Vertex> getLinks() {
        return links;
    }

}

import java.util.ArrayList;

public class Mesh {

    private Vertex head = new Vertex();
    private Material material = new Material();

    public Vertex getHead() {
        return this.head;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material){
        this.material = material;
    }

    public int countVertices() {
        int vertices = 0;
        return vertices;
    }

    public int countEdges() {
        int edges = 0;
        return edges;
    }

    public int countFaces() {
        int faces = 0;
        return faces;
    }

    public Vertex getVertex(int id){
        Vertex node = new Vertex();
        node.setID(id);
        return node;
    }

    public void delete(int id){

    }

    public boolean add(Transform trans, ArrayList<Vertex> adjVertices){
        return true;
    }

    public boolean search(Vertex target){
        return true;
    }

    private void validate(){
        System.out.println("Validate Private Method Called");
    }
}

import java.util.List;

public class XDObject {
    private String objectId;
    private String name;
    private List<Component> components;
    public String getID() {
        return this.objectId;
    }
    public void setID(String s) {
        this.objectId = s;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public Component getComponent(String t) {
        return this.components.get(this.components.indexOf(t));
    }
    public void addComponent(Component comp)
    {
        this.components.add(comp);
    }
    public void removeComponent(String targetID)
    {
        this.components.remove(targetID);
    }
}

public class Component {
    private String name;
    private boolean isHidden;
    private ComplexTransform compTransform;
    private int componentID;

    public void hide(){isHidden = true;}
    public String getName(){return name;}
    public void setName(String s){name =s;}
    public int getComponentID(){return componentID;}
    public void setComponentID(int ID){componentID=ID;}
}

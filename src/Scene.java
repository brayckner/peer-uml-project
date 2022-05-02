import java.util.ArrayList;

public class Scene 
{
  int sceneID;
  String name;
  ArrayList<XDObject> objectList;
  public int getID()
  {
   return sceneID;
  }
  public void setID(int i)
  {
   sceneID = i;
  }
  public String getName()
  {
   return name;
  }
  public void setName(String s)
  {
   name = s;
  }
  public ArrayList<XDObject> objects()
  {
    return objectList;
  }
}

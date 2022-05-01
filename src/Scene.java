public class Scene implements XDObject {
  int sceneID;
  String name;
  List<XDObject> objectList;
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
  public List<XDObject> objects()
  {
    return objectList;
  }
}

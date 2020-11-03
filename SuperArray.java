public class SuperArray{

  private String[] data;
  private int size;

  //constructor
  public SuperArray()
    {
      data = new String[10];
      size = 0;
    }

  //methods
  public int size()
    {
      return size;
    }

  public boolean add(String element)
    {

    }

  public String set(int index, String element)
    {

    }

  private void resize()
    {
      String[] newArr = new String[superArray.length + 10];
      for (int i = 0; i < newArr.length; i++)
        {
          newArr[i] = superArray[i];
        }
      data = newArr;
    }

}

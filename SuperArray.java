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
      if (data.length == size)
        resize();
      data[size] = element;
      size++;
      return true;
    }

  public String get(int index)
    {
      return data[index];
    }

  public String set(int index, String element)
    {
      if (data[index] != null)
        data[index] = element;
      return element;
    }

  private void resize()
    {
      String[] newArr = new String[data.length + 10];
      for (int i = 0; i < data.length; i++)
        {
          newArr[i] = data[i];
        }
      data = newArr;
    }

}

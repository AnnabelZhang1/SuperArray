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

  //11-4-2020
  public void clear()
    {
      size = 0;
      data = null;
    }

  public boolean isEmpty()
    {
      return size == 0;
    }

  public String toString()
    {
      String n = "[" + data[0];
      for (int i = 1; i < size; i++)
        n += ", " + data[i];
      n += "]";
      return n;
    }

  public boolean contains(String s)
    {
      for (int i = 0; i < size; i++)
        {
          if (data[i].equals(s))
            return true;
        }
      return false;
    }
/*
  public SuperArray(int initialCapacity)
    {

    }
*/
}

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
      if (index < 0 || index >= size())
        throw new IndexOutOfBoundsException("Index number " + index + " cannot be less than 0 nor greater than the array size");
      else
        return data[index];
    }

  public String set(int index, String element)
    {
      if (index < 0 || index >= size())
        throw new IndexOutOfBoundsException("Index number " + index + " is incorrect");
      else
        {
          String n = data[index];
          data[index] = element;
          return n;
        }
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
      if (size == 0)
        return "[]";
      else
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

  public SuperArray(int initialCapacity)
    {
      if (initialCapacity < 0)
        throw new IllegalArgumentException("An initialCapacity of " + initialCapacity + " cannot be a negative number");
      else
        {
          data = new String[initialCapacity];
          size = 0;
        }
    }

  public void add(int index, String element)
    {
      if (index < 0 || index > size)
        throw new IndexOutOfBoundsException("Index number " + index + " cannot be less than 0 nor greater than the array size");
      else
        {
          size += 1;
          String[] newArr = new String[data.length + 1];
          for (int i = 0; i < newArr.length; i++)
            {
              if (i < index)
                newArr[i] = data[i];
              else if (i > index)
                newArr[i] = data[i - 1];
              else
                newArr[i] = element;
            }
          data = newArr;
        }
    }

  public String remove(int index)
    {
      if (index < 0 || index >= size())
        throw new IndexOutOfBoundsException("Index number "
                                           + index
                                           + " cannot be less than 0 nor greater than the array size");
      String item = data[index];
      String replace = data[size-1];
      String n = "";
      data[size-1] = null;
      for (int i = size - 2; i > index; i--)
        {
          n = data[i];
          data[i] = replace;
          replace = n;
        }
      data[index] = replace;
      size -= 1;
      return item;
    }

  public int indexOf(String s)
    {
      for (int i = 0; i < size; i++)
        {
            if (data[i].equals(s))
              return i;
        }
      return -1;
    }

  public String[] toArray()
    {
      String[] arr = new String[size];
      for (int i = 0; i < size; i++)
        arr[i] = data[i];
      return arr;
    }

//11-6-2020
  public int lastIndexOf(String value)
    {
      for (int i = size()-1; i > 0; i--)
        {
          if (data[i].equals(value))
            return i;
        }
      return -1;
    }

  public boolean equals(SuperArray other)
    {
      if (this.size() == other.size())
        {
          for (int i = 0; i < this.size(); i++)
            {
              if (!data[i].equals(other.get(i)))
                return false;
            }
          return true;
        }
      else
        return false;
    }
}

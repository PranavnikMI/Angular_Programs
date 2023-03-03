
class Demo
{
    public int Size;
    public int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Contructor");
        Size = No;
        Arr = new int[Size];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
    }
 
}

class FinalizeDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
}
class A
{
    public void show1()
    {
        System.out.println("In A");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B");
    }
}
public class index 
{
public static void main(String[] args) {
    A obj = new B(); //upcasting. This is same as; (A) new (B)
    obj.show1();

    B obj1 = (B) obj; //Downcasting
    obj1.show2();
    
    B obj2 = new B(); //normal
    obj2.show2();
    obj2.show1();

}
    
}
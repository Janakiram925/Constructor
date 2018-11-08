
class Constructor 
{
private	int rollno ;
	String name;
	Constructor(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public int m1()
	{
		return rollno;
	}
	public String m2()
	{
		return name;
	}
}
class External
{
	public static void main(String[] args) 
	{
		Constructor c1 = new Constructor(4258,"janakiram");
		//Constructor c2 = new Constructor();
		System.out.println(c1.m1());
		System.out.println(c1.m2());
		System.out.println("hello");
	}
}

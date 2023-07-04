package studentenc;


class Studentenc
{
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	//getAge method
	public int getRollno() {
		return rollno;
		}
		
		//setAge method
	public void setRollno(int rollno) {
		this.rollno = rollno;
		}

	//getName method
	public String getName() {
		return name;
	}
	
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge method
	public int getAge() {
		return age;
	}
	
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}
	//getName method
	public String getAddress() {
		return address;
		}
		
	//setName method
	public void setAddress(String address) {
		this.address = address;
		}
}
class StudentMain
{

	public static void main (String[] args)
	{
		//Creating instance of class Encapsulation
        Studentenc s=new Studentenc();
		
		//Setting values
                s.setRollno(2001);
		s.setName("Abhijeet");
		s.setAge(24);
		s.setAddress("mumbai");
		
		//Print values
		System.out.println("Rollno is:" + s.getRollno());
		System.out.println("Name is:" + s.getName());
		System.out.println("Age is:" + s.getAge());
		System.out.println("Name is:" + s.getAddress());
	} 
}
	

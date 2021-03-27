package objequality;

public class Employee {
	private int empid;
	private String empname;
	private double salary;
	public Employee()
	{
		
	}
	public  Employee(int empid,String empname,double salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	@Override
	public int hashCode() {
		return empid+empname.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

}
//Equals and hashCode method which is declared in Object.
//whenever u want to compare two objects consisting multiple fields, override equals and 
//hashCode method.
//when two objects are equals they will always have same hash code
//if they have same hashcode it is not necessary they are equals



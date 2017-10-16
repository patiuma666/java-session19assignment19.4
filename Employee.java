package priorityqueue;
//created package name as priority queue
public class Employee implements Comparable<Employee> {
	//created class name as Employee which implements the Comparable
	//created variables as private
	private String name, designation;
	private float salary;
	//creating constructors 
	public Employee(String name, String designation, float salary) {
		super(); //super refers the current obj of the previous class
		this.name = name; //this refers the current variables
		this.designation = designation;
		this.salary = salary;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString(){
		return "Name: " + name + ", Salary: " + salary + ", Designation: " +  designation;		
	}
	

	@Override
	public int compareTo(Employee o) {
		if(salary > o.salary){
			return 1;
		}else{
			return -1;
		}
	}
	

}

package priorityqueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueExample {
	//created class name has PriorityQueueExample

	public static void main(String[] args) { //created main method
		
		// PriorityQueue is a queue in which elements are ordered according to specified Comparator.
		//if there is no comparator elements are specified in natural order
		//this priority queue does not allows the null elements
		//created integer type of priority queue
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(20); //passing the elements in the queue
		priorityQueue.add(90);
		priorityQueue.add(50);
		priorityQueue.add(35);			
		// in this elements must be in comparable so we are using comparable type 
		//priorityQueue.poll();
		Object [] arr = priorityQueue.toArray();
		Arrays.sort(arr);//it irrates the elements and sort them 
		//Iterator<Integer> itr = priorityQueue.iterator();
		for(Object elements : arr){ //using for each loop to the object elements
			System.out.println(elements);
		}
		
		
		//creating priority queue for  Employee
		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<Employee>(15, new SalaryComparator());
		employeePriorityQueue.add(new Employee("sanju", "manager", 50000));
		employeePriorityQueue.add(new Employee("Aruna", "tester", 25000));
		employeePriorityQueue.add(new Employee("Nirmal", "Assis manager", 18000));
		employeePriorityQueue.add(new Employee("Yojana", " Developer", 45000));
		

		Arrays.sort(employeePriorityQueue.toArray());
		
		Iterator<Employee> employeeIterator = employeePriorityQueue.iterator();
		while(employeeIterator.hasNext()){
			System.out.println(employeeIterator.next());
		}
	}

}
//this class implements the comparator
class SalaryComparator implements Comparator<Employee>{

	@Override//it compare the get salary and the returns the value
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary()){
			return 1;
		}else if(o1.getSalary() < o2.getSalary()){
			return -1;
		}else{
			return 0;
		}
	}


}

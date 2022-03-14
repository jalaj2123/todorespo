import java.util.*;
import java.text.SimpleDateFormat;

public class Employee  {

	
	private int empno;
    private String ename;
    private int salary;
    
Employee(int empno,String ename,int salary)
{
	this.empno=empno;
	this.ename=ename;
	this.salary=salary;
}
public int getempno() 
{
	return empno;
	
}
public String getename() {
	return ename;
	
}
public int getsalary() {
	return salary;
	
}
public String toString() {
	return empno + " "+ ename + " "+ salary;
}

 }
 
 
 
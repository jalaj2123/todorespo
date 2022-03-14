import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo 
{

	 public static void main(String arg[])
	 {
		 SimpleDateFormat s=new SimpleDateFormat("HH:mm:ss");
		 Date d=new Date();
		 List<Employee> c = new ArrayList<Employee>();
		 Scanner sc = new Scanner(System.in);//why
		 int ch =0;
		 do {
			 System.out.println("1.INSERT");
			 System.out.println("2.DISPLAY");
			 System.out.println("3.SEARCH");
			 System.out.println("4.DELETE");
			 System.out.println("5.UPDATE");
			 System.out.println("ENTER YOUR CHOICE :");
			 ch=sc.nextInt();
			 switch(ch){
			 case 1:
				 System.out.print("Enter empno :");
			 int eno=sc.nextInt();
			 System.out.print("Enter empName :");
			 String ename=sc.next();
			 System.out.print("Enter Salary :");
			 int salary=sc.nextInt();
			 c.add(new Employee(eno,ename,salary));
			 System.out.println("-----------------");
			 System.out.println("Record Insert"+" | "+s.format(d)); 
			 System.out.println("----------------");
			 break;
			 case 2:
				 System.out.println("----------------");
				 Iterator<Employee> i=c.iterator();
				 while(i.hasNext())
				 {
					 Employee e=i.next();
					 System.out.println(e);
					 
					 
				 }
				 System.out.println("-----------------");
				 break;
			 case 3:
				 boolean found =false;
				 System.out.println("Enter empno");
				 int empno=sc.nextInt();
				 System.out.println("-----------------");
				  i=c.iterator();
				 while(i.hasNext())
				 {
					 Employee e=i.next();
					 if(e.getempno() == empno) {
						 System.out.println(e);
						 found=true;
					 }
					 
				 }
				 if(!found) {
					 try
					 {
						 throw new CustomException();
					 }
					 catch(CustomException e){
						 
					 
					 System.out.println(e);
				 }
				 }
				 System.out.println("-----------------");
				 break;
			 case 4:
				 found =false;
				 System.out.println("Enter empno to delete");
				 empno=sc.nextInt();
				 System.out.println("------------------");
				  i=c.iterator();
				 while(i.hasNext())
				 {
					 Employee e=i.next();
					 if(e.getempno()==empno) {
						 i.remove();
						 found=true;
					 }
					 
				 }
				 if(!found) {
					 try
					 {
						 throw new CustomException();
					 }
					 catch(CustomException e){
						 
					 
					 System.out.println(e);
				 }
				 }
					 else
					 {
						 System.out.println("Record Delete Successfully"+" | "+s.format(d)); 
					 }
				 System.out.println("------------------");
				 
				 break;
			 case 5:
				 found =false;
				 System.out.println("Enter empno to Update");
				 empno=sc.nextInt();
				 System.out.println("------------------");
				 ListIterator<Employee> li=c.listIterator();
				 while(li.hasNext())
				 {
					 Employee e=li.next();
					 if(e.getempno()==empno) {
						 
						System.out.println("Enter new Name");
						ename=sc.next();
						System.out.println("Enter new Salary");
						salary=sc.nextInt();
						li.set(new Employee(empno,ename,salary));
						found=true;
					 }
					 
				 }
				 if(!found) {
					 try
					 {
						 throw new CustomException();
					 }
					 catch(CustomException e){
						 
					 
					 System.out.println(e);
				 }
				 }
					 else
					 {
						 System.out.println("Record is Update Successfully"+" | "+s.format(d)); 
					 }
				 System.out.println("------------------");
				 
				 break;
			 }
				 
			 }while(ch!=0);
	 }
 }
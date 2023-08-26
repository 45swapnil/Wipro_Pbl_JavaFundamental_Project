package Project;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the Emp id");
				
				int eid=sc.nextInt();
				
				if(eid==1001)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1001 \t Ashish \t R&D \t \t Engineer \t "+(20000+8000+20000-3000));
				}
				
				else if(eid==1002)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1002 \t Sushma \t PM \t \t Consultant \t "+(30000+12000+32000-9000));
				}
				
				else if(eid==1003)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1003 \t Rahul \t \t Acct \t\t Clerk \t \t "+(10000+8000+12000-1000));
				}
				
				else if(eid==1004)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1004 \t Chahat \t Front Desk \t Recuptionist \t "+(12000+6000+15000-2000));
				}
				
				else if(eid==1005)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1005 \t Ranjan \t Engg \t \t Manager \t "+(20000+8000+40000-3000));
				}
				
				else if(eid==1006)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1006 \t  Suman \t Manufacturing \t Engineer \t "+(23000+9000+20000-3000));
				}
				else if(eid==1007)
				{
					System.out.println("Emp NO \t Emp Name \t Deperment \t Designation \t salary");
					System.out.println("1007 \t Tanmay \t PM \t \t Clerk \t \t "+(29000+12000+12000-10000));
				}
				else
				{
					System.out.println("There is no empid :"+eid);
				}				

			}
}

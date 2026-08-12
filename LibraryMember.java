importjava.util.Scanner;
abstract class LibraryMember{
	int member Id;
	string name,email,phone;
	LibraryMember(int memberId,String name,String email,String phone) {
		this.memberId=memberId;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	void display() {
		System.out.println("Member ID:"+memberId);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Phone:"+phone);
         }
         
         abstract void generateSummary();
       }
 class StudentMember extends LibraryMember {
 
 	StudentsMember(int id,String name,String email,String phone) {
 	super(id,name,email,phone);
     }
     void generateSummary() {
     System.out.println("\n-----Student Member-----");
     display();
     System.out.println("Borrowing Limit :5 Books");
     System.out.println("Penalty Per Day  :Rs.2");
     System.out.println("Annual Membership Fee:Rs.200");
     }
  }
  class FacultyMember extends LibrarMember {
  	FacultyMember(int id,String name,String email,String phone)  {
  	super(id,name,email,phone);
  	}
  	void generateSummary()  {
  	System.out.println("\n-----Faculty Member-----");
  	display();
  	System.out.println("Borrowing Limit : 10 Books");
  	System.out.println("Penalty Per day  : Rs.3");
  	System.out.println("Annual Membership Fee:Rs.500");
  	}
 }
 	class ExternalMember extends LibraryMember {
 	ExternalMember(int id,String name,String email,String phone)  {
  	super(id,name,email,phone);
  	 }
  	 
  	 void generateSummary()  {
  	System.out.println("\n-----External  Member-----");
  	display();
  	System.out.println("Borrowing Limit : 10 Books");
  	System.out.println("Penalty Per day  : Rs.3");
  	System.out.println("Annual Membership Fee:Rs.500");l
  	}
 }
 public class Main {
        Public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Member ID:");
        int id =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name=sc.nextLine();
        System.out.print("Enter Email:");
        String email=sc.nextLine();
        System.out.print("Enter Phone:");
        String phone=sc.nextLine();
        System.out.println("\nSelect Member Type");
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        System.out.println("3. External");
        System.out.println("Enter choice:");
        int choice=sc.nextInt();
        
        switch(choice)    {
        case1:
          StudentsMember s=new StudentsMember(id,name,email,phone);
          s.generateSummary():
          break;
         case 2:
          FacultyMember f=new FacultyMember(id,name,email,phone);
          f.generateSummary():
          break;
         case 3:
           ExternalMember e=new ExternalMember(id,name,email,phone);
          e.generateSummary():
          break;
        default:
            System.out.println("invalid Choice");
            }
            sc.close();
            }
         }
         
        
        

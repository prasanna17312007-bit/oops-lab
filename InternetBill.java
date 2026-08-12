import java.util.Scanner;
class InternetBill {
public static void main(String[ ]args) {
Scanner sc=new Scanner(System.in);
int accNo;
String name,plan;
double prev,curr,usage,bill=0;
System.out.println("enter Account number:");
accNo=sc.nextInt();
sc.nextLine();
System.out.println("enter account holder name:");
name =sc.nextline();
System.out.println("enter  previous usage:");
prev=sc.nextDouble();
System.out.println("enter current usage:");
curr=sc.nextDouble();
System.out.println("enter plan type(basic/premium):");
plan=sc.next();
usage=curr-prev;
if(plan.equalsIgnoreCase("basic")) {
   if(usage<=50)
     bill=usage*20;
     else 
     bill=(50*20)+(usage- 50)*30;
     } 
 else if (plan.equalsIgnoreCase("premimum"))
     {
               if(usage<=100)
               bill=usage*15;
             else
             	bill=(100*15)+(usage-100)*25;
      }
        System.out.println("/n Account number:"+ accNo);
        System.out.println("Account holder:"+ name);
        System.out.println("plan type:"+plan);
        System.out.println("Data used:"+usage+"GB");
        System.out.println("Monthly bill:Rs."+bill);
              }
         }

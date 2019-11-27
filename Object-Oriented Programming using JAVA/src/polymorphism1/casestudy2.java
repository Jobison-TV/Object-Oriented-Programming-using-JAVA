package polymorphism1;
import java.util.Scanner;
public class casestudy2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the billno");
int billno=sc.nextInt();
System.out.println("Enter the name");
    String name=sc.next();
    System.out.println("Enter the number of calls");
int noofcalls=sc.nextInt();
System.out.println("Enter the cost per call");
int costpercall=sc.nextInt();
System.out.println("Enter the bill number");
int currentbillno=sc.nextInt();
System.out.println("Enter the customer name");
String customername=sc.next();
System.out.println("Enter the number of units consumed");
int noofunitsconsumed=sc.nextInt();
System.out.println("Enter the cost per unit");
int costperunit=sc.nextInt();
     Bill b=new Bill();
b.bill(billno,name);
TelephoneBill t=new TelephoneBill();
t.generatebill(noofcalls,costpercall);
Currentbill c=new Currentbill();
c.generatebill(noofunitsconsumed,costperunit);
}
}
class Bill
{
public void bill(int billno,String name)
{
System.out.println("bill number:      "+billno);
System.out.println("name       :      "+name);

}
}
class TelephoneBill extends Bill{
public void generatebill(int noofcalls,int costpercall)
{
System.out.println("number of calls:      "+noofcalls);
System.out.println("cost per call:      "+costpercall);
double cost=noofcalls*costpercall;
System.out.println("telephone bill amount is:         "+cost);


}
}
class Currentbill extends Bill{
public void generatebill(int noofunitsconsumed,int costperunit)
{ int amount=0;
System.out.println("number of units consumed:      "+noofunitsconsumed);
System.out.println("cost per unit:      "+costperunit);
 amount=noofunitsconsumed*costperunit;
System.out.println("current bill amount is:  "+amount);

}
}


import java.util.Scanner;
public class  Customer{
    //Attributes,instance variables
      static String name;
     static String address;
     static String phonenumber;
     static String country;
     static boolean isInternational;

    //Constructors
    public Customer(String name,String address,String phonenumber,String country,boolean isInternational){

        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.country=country;
        this.isInternational=isInternational;

    }

    //Methods, for the objects.
    public void deposit(){
    System.out.println(name + "  deposited Cash");
}

    public void withdraw(){
    System.out.println(name + " is withdrawing Cash");
}
    public void renew(){
    System.out.println(name + " is renewing Cash");}
    
    public void checkbalance(){
    System.out.println(name  + " is checking balance");
}

public static void main (String args[]){
    Scanner scanner =new Scanner(System.in);
//Local customer details

    Customer localcustomer= new Customer(name,address,phonenumber,country,false);
System.out.println("Enter the local customer name:");
String name=scanner.nextLine();
System.out.println("Enter the local customer address:");
String address=scanner.nextLine();
System.out.println("Enter the local customer phone number:");
String phonenumber =scanner.nextLine();
System.out.println("Enter the local customer  country:");
String country=scanner.nextLine();

//International Customer details,rused variables as they were already declared in object local customer.
Customer intercustomer1= new Customer (name,address,phonenumber,country,true);
System.out.println("Enter the interCustomer name");
 name=scanner.nextLine();
System.out.println("Enter the interCustomer address:");
 address=scanner.nextLine();
System.out.println("Enter the  interCustomer phone number:");
 phonenumber =scanner.nextLine();
System.out.println("Enter the interCustomer  country:");
country=scanner.nextLine();
scanner.close();
// invoking methods for local customers

localcustomer.deposit();
localcustomer.withdraw();
localcustomer.renew();
localcustomer.checkbalance();

//invoking methods for international customers.
intercustomer1.deposit();
intercustomer1.withdraw();
intercustomer1.renew();
intercustomer1.checkbalance();



}

}
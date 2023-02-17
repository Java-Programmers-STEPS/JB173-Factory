package factory;
import java.io.*;
import java.util.Scanner;
 
public class phoneBill {
      public static void main(String args[])throws IOException{
            SelectNetworkFactory planFactory = new SelectNetworkFactory();
            System.out.print("Enter the name of network for which the bill will be generated: ");
           Scanner scanner=new Scanner(System.in);
            String networkName=scanner.next();
            System.out.print("Enter the number of minutes for bill will be calculated: ");
            int minutes=scanner.nextInt();
            cellularplan p = planFactory.getPlan(networkName);
            System.out.print("Bill amount for "+networkName+" of "+minutes+" units is: ");
            p.getRate();
            p.processBill(minutes);
      }
}

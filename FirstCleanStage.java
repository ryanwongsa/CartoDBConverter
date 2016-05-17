import java.io.*;
import java.util.*;

public class FirstCleanStage
{
  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(new File(args[0]));
    int extraInfo = Integer.parseInt(args[1]);
    //EDIT THIS DEPENDING ON FORMAT
    sc.nextLine();
    while(sc.hasNextLine())
    {
      String line = sc.nextLine();
      String[] parts = line.split(";");
      int length = parts.length;
       if(!parts[0].equals(""))
       {
         String data="";
         for(int i=0;i<length-extraInfo;i++)
         {
           data+=parts[i].replace("\"","")+" ";
         }
         String allData= data + ", Cape Town, South Africa";
         String newData = allData.replace(";"," ");
         System.out.print(newData+";");
         for(int i=length-extraInfo;i<length;i++)
            System.out.print(parts[i]+";");
         System.out.println();
       }
    }
  }
}

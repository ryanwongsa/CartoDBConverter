import java.io.*;
import java.util.*;
public class Converter
{
  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(new File("locations.txt"));

    String lat;
    String lng;
    boolean found=false;
    while(sc.hasNextLine())
    {
      String line = sc.nextLine();
      if(line.contains("\"location\""))
      {
        lat = sc.nextLine().split(":")[1].replace(",","");
        lng = sc.nextLine().split(":")[1];

        System.out.println("\"{\"\"type\"\":\"\"Point\"\",\"\"coordinates\"\":["+lng+","+lat+"]}\""+","+args[0]);
        found=true;
        break;
      }
    }
    if(found==false)
      System.out.println(args[0]);
  }
}

import java.io.*;
import java.util.*;

public class CreateSecondaryStageScript
{
  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(new File("FirstCleaned.txt"));
    System.out.println("#!/bin/bash");
    //EDIT THIS DEPENDING
    System.out.println("echo geojson,\""+args[0]+"\" > \"ThirdStageFile.csv\"");

    while(sc.hasNextLine())
    {
      String line = sc.nextLine();
      String[] parts = line.split(";");

      System.out.println("geocode --json \""+parts[0]+"\" > locations.txt");
      String rest="";
      for(int i=1;i<parts.length;i++)
        rest+=parts[i]+",";
      rest = rest.substring(0,rest.length()-1);
      System.out.println("java Converter \""+rest+"\">> \"ThirdStageFile.csv\"");

    }
  }
}

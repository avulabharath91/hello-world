package com.bharath.test;

import java.io.*;
public class TestRead
{
  {
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    FileReader fr =new FileReader("/Users/krithisurabhi/Desktop/Untitled.rtf");
    int i;
    while ((i=fr.read()) != -1)
      System.out.print((char) i);
  }
}
}

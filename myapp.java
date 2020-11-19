import java.io.*;
import java.util.Scanner;
import java.io.*;

class myapp {
public static void main(String[] args) {
System.out.println("My sample app to test multi repo sharing common core code - PJ");

int character;
StringBuffer buffer = new StringBuffer("");
try
{
FileInputStream inputStream = new FileInputStream(new File("/base-core/folder1/file1"));

while( (character = inputStream.read()) != -1)
        buffer.append((char) character);

inputStream.close();
System.out.println(buffer);
}
catch(IOException ex) { System.out.println("Error reading file" + ex); }
}
}




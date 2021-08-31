import java.util.*;
import java.util.Map.Entry;

public class Simple{
Map<String, String> Hash = new HashMap<String, String>();

public Simple()
{
Hash.put("Bob","A");

Hash.put("Mary","C");
Hash.put("Sarah", "B");

Hash.put("Philip","A");

Hash.put("Greg","F");
}
public void printHash()
{
Iterator<Entry<String, String>> entries = Hash.entrySet().iterator();
while (entries.hasNext())
{ 
//sample
  Entry<String,String> entry = entries.next();
  System.out.println("key = " + entry.getKey()+ " , Value " + entry.getValue());
  
}
} 


public void printHash2()
{

for (Map.Entry<String, String> entry: Hash.entrySet()) 
{
System.out.println("Key = " + entry.getKey() + ",Value " + entry.getValue());
}

for (String key: Hash.keySet()) 
{
System.out.println("key = " +key);
}
for (String value : Hash.values())
{
System.out.println("Value = " +value);
}
}
public static void main(String[] args)
{ 
Simple obj = new Simple(); 
obj.printHash();
obj.printHash2();
}
}
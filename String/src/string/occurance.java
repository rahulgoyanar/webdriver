package string;

public class occurance {
	
	public static int countOccurrences(String find, String string)
	{
	int count = 0;
	int indexOf = 0;
	 
	while (indexOf > -1)
	{
	    indexOf = string.indexOf(find, indexOf + 1);
	    if (indexOf > -1)
	            count++;
	      }
	return count;
	 }

	 public static void main(String[] args) {
	  
	 int charCount=countOccurrences("a", "Instance of Java");
	 
	 System.out.println("Number of occurrences of given character:"+charCount);
	 
	}

	}


package caesar;


import java.util.Scanner;


class Caesar
{ 
	public static StringBuffer encrypt(String text, int key) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
			if (Character.isUpperCase(text.charAt(i))) 
			{ 
				char ch = (char)(((int)text.charAt(i) + key - 65) % 26 + 65); 
				result.append(ch); 
			} 
			else
			{ 
				char ch = (char)(((int)text.charAt(i) + key - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	} 
        public static StringBuffer Decrypt(String text, int key)
        {            
            StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
			if (Character.isUpperCase(text.charAt(i))) 
			{ 
				char ch = (char)(((int)text.charAt(i) - key -90) % 26 + 90); 
				result.append(ch); 
			} 
			else
			{
				char ch = (char)(((int)text.charAt(i) - key - 122) % 26 + 122); 
				result.append(ch); 
			} 
		} 
		return result;
            
        }

        public static void main(String[] args) 
	{ 
		Scanner ip = new Scanner(System.in); 
                System.out.println("Enter message:");
                String text = ip.nextLine();
                System.out.println("Enter key :");                
		int key = ip.nextInt(); 
		System.out.println("Text : " + text); 
		System.out.println("Shift : " + key); 
		String cipher;
                cipher = encrypt(text, key).toString();
                System.out.println("Cipher text  :"+cipher);
                System.out.println("Decipher Text :"+Decrypt(cipher,key));
	} 
	
        
        
        
        
        
        
        
        
        
        
        
        
	
} 

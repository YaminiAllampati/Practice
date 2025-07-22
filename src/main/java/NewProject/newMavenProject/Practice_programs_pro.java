package NewProject.newMavenProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice_programs_pro {

	    public static void main(String[] args)
	    {
	    	
	    	
	    String s1="rat";
	    String s2="art";
	    
	    char c1[] = s1.toCharArray();
	    char c2[] = s2.toCharArray();
	    
	    System.out.println(Arrays.toString(c1));
	    System.out.println(Arrays.toString(c2));
	    
	    System.out.println("After soritng : ");
	    
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    System.out.println(Arrays.toString(c1));
	    System.out.println(Arrays.toString(c2));
	    }
	    
	    
	    }
	    /*	String s="yamini allmapti";
	        char c[] = s.toCharArray();
	        
	        Set<Character> s1 = new LinkedHashSet<Character>();
	        
	        for(char op:c)
	        {
	            s1.add(op);
	        }
	        System.out.println(s1);
	        
	        StringBuffer s3 = new StringBuffer();

	        for(char s4:s1)
	        {
	            s3.append(s4);
	        }
	        System.out.println(s3);
	        }
	   }
	    	
	    }
	    }
	    	
	    	
	   /* 	for(int j=1; j<=100; j++)
	    	{
	    	int c=0;
	    	int temp=j;
	    	for(int i=1; i<=j; i++)
	    	{
	    		if(temp%i==0)
	    		{
	    			c++;
	    			
	    		}
	    	}
	    	if(c==2)
	    	{
	    		System.out.println("prime" + j);
	    	}
	    	
	    	
	    }
	    }
}

	    	
	   /* 	String s="YAMIN *&( alsd 1234";
	    	char c[] = s.toCharArray();
	    	int uc=0;
	    	int lc=0;
	    	int sp=0;
	    	int d=0;
	    	for(Character c1:c)
	    	{
	    		if(Character.isUpperCase(c1))
	    		{
	    			uc++;
	    		}
	    		else if(Character.isLetter(c1))
	    		{
	    			lc++;
	    		}
	    		else if(Character.isDigit(c1))
	    		{
	    			d++;
	    		}
	    		else
	    		{
	    			sp++;
	    		}
	    	}
	    	System.out.println("Uppercase : "+uc +" LowerCase :" + lc + " Digits : " + d + " SpCharc :" + sp);
	    	
	    	
	    }
	    }
	    	
	 /*   String s ="ya,mi,ni";
	    
	    System.out.println(s);
	    
	    System.out.println(s.replace(",", ""));
	    	
	    }
	    }
	    	
	    	
	     /*	for(int i=1; i<=5; i++)
	    	{
	    		for(int j=5; j>=i; j--)
	    		{
	    			System.out.print("* ");
	    		}
	    		
	    		System.out.println();
	    	}
	    	
	    	
	    }
	    }
	    	
	    
	    
	    	
	   /* 	for(int i=1; i<=5; i++)
	    	{
	    		for(int j=1; j<=i; j++)
	    		{
	    			System.out.print(j + " ");
	    		}
	    		
	    		System.out.println();
	    	}
	    	
	    	
	    }
}
	    	
	    /*	 String s="yamini allmapati yamini";
	         String s1[]=s.split(" ");
	         
	         Map<String,Integer> m = new HashMap<String,Integer>();
	         
	         for(int i=0; i<s1.length; i++)
	         {
	             if(m.containsKey(s1[i]))
	             {
	                 m.put(s1[i], m.get(s1[i])+1);
	             }
	             else
	             {
	                 m.put(s1[i],1);
	             }
	         }
	         System.out.println(m);
	    	
	    }
	    }
	    /*	 String s="yamini";
	         char c[]=s.toCharArray();
	         
	         Map<Character,Integer> m = new HashMap<Character,Integer>();
	         
	         for(int i=0; i<c.length; i++)
	         {
	             if(m.containsKey(c[i]))
	             {
	                 m.put(c[i],m.get(c[i])+1);
	             }
	             else
	             {
	                 m.put(c[i],1);
	             }
	         }
	         System.out.println(m);
	    	
	    }
	    }
	    	
	    /*	String s="yamini allam";
	    	char c[] = s.toCharArray();
	    	
	    	int sc=0;
	    	
	    	for(char op :c)
	    	{
	    		sc++;
	    	}
	    	System.out.println("Strimg count :" + sc);
	    	
	    }
	    }
	    	
	  /*  int a=0;
	    int b=1;
	    
	    System.out.println(a);
	    System.out.println(b);
	    
	    
	    for (int i=1; i<=20; i++)
	    {
	    	int c=a+b;
	  
	      if(c<=100)
	      {
	    	  System.out.println(c);
	    	  a=b;
		       b=c;
		       
	    	 
	      }
	    }
	    	
	    	
	    }
	    }
	    	/*int ec=0;
	    	int oc=0;
	    	
	    	for(int i=1; i<=13; i++)
	    	{
	    		if(i%2==0)
	    		{
	    			ec++;
	    		}
	    		else
	    		{
	    			oc++;
	    		}
	    	}
	    	System.out.println("even count : "+ ec);
	    	System.out.println("even count : "+ oc);

	    	
	    	
	    }
}
	
	   /* 	int c=0;
	    	
	    	Scanner s= new Scanner(System.in);
	    	System.out.println("enter a vlaue :");
	    	int a=s.nextInt();
	    	System.out.println("enter b vlaue :");
	    	int b=s.nextInt();
	    	System.out.println(a);
	    	System.out.println(b);
	    	
	    	a=a+b;// 3
	    	b=a-b;//1
	    	a=a-b; //2
	    	System.out.println(a);
	    	System.out.println(b);
	    	
	    }
}
	    	/*c=a;
	    	//a=b; //2
	    	//b=c; //0
	    	
	    	
	    }
	    
	    }
	    	
	    	
	    /*	  //int n=152;
	        //int sum=0;
	        //int temp=n;
	        
	        for(int i=0; i<=100;i++)
	        {
	            int n=i;
	            int temp=n;
	            int sum=0;
	        while(n>0)
	        {
	            int r =n%10;
	            sum=sum*10+r;
	            n=n/10;
	        }
	        //System.out.println(sum);
	       if(temp==sum)
	       {
	                  System.out.println("palindrome" + i);
	       }
	       
	        }
	    }
	    	
	    /*	int n=1234;
	    	
	    	int c=0;
	    	
	    	while(n>0)
	    	{
	    		
	    		c++;
	    		n=n/10;
	    		
	    	}
	    	System.out.println("count : "+ c);
	    }
	    }
	      
	    	   
	    /*    //int n=152;
	        //int sum=0;
	        //int temp=n;
	        
	        for(int i=0; i<=1000;i++)
	        {
	            int n=i;
	            int temp=n;
	            int sum=0;
	        while(n>0)
	        {
	            int r =n%10;
	            sum=sum+r*r*r;
	            n=n/10;
	        }
	        //System.out.println(sum);
	       if(temp==sum)
	       {
	                  System.out.println("amstrong" + i);
	       }
	       
	        }
	     }
	    	
	    }
}

	    	
	    	
	 /*String s="yamini allampati";
	       String k[]=s.split(" ");
	       System.out.println(Arrays.toString(k));
	       //System.out.println(k[1]);
	       for (String s1:k)
	       {
	           String s2=s1;
	           String op="";
	       for(int i=s2.length()-1;i>=0;i--)
	       {
	           char c= s2.charAt(i);
	           op=op+c;
	       }
	       op = op + " ";
	       System.out.print(op);
	       }
	    }
	}

import java.util.Arrays; 
public class p
{
    public static void main(String[] args)
    {
       String s="madam";
        String op="";
       for(int i=s.length()-1;i>=0;i--)
       {
           char c= s.charAt(i);
           op=op+c;
       }
     if(op.equals(s))
     {
         System.out.println("Palindrome");
     }
     else
     {
         System.out.println("not a palindrome");
     }
     
    }
} */

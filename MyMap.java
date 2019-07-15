package com.accolite.au.java;

import java.util.Scanner;

public class MyMap {

int key;
int value;
MyMap after;
MyMap next;
MyMap first;
MyMap last;
MyMap[] arr = new MyMap[10];

MyMap()
{
	
}
MyMap(int key, int value)
{
this.key =key;
this.value= value;
}

public void put(int key, int value)
{
         int hash = key%10;
         MyMap newValue = new MyMap(key, value);
         arr[hash]= newValue;
         if(first==null)
         {
             first = newValue;
             last = newValue;
         }
         else if(arr[hash]==null)
           {
           last.after = newValue;
           //newValue.before=last;
           last=newValue;
           newValue.next=null;
         
          }
         else
         {
        	 MyMap curr;
        	 curr = first;
        	 while(curr.after!= null)
        	 {
        		 if(curr.equals(arr[hash]))
        		 {
        			 MyMap temp ;
        			 temp = curr;
        			 while(temp.next!=null)
        			 {
        				 
        				 temp = temp.next;
        			 }
        			 temp.next = newValue;
        			 newValue.next=null;
        		 }
        		 curr = curr.after;
        	 }
        	 curr.after = newValue;
        	 newValue.after = null;
        	 last.after = newValue;
        	 last = newValue;
        	 }
        	 
}
         

public int get(int key)
{
MyMap curr = first;
while(curr!=null)
{
	if(curr.key==key)
	{
		break;
	}
	curr = curr.after;
}
if(curr== null)
{
	return -1;
}
else return curr.value;
}

public void display()
{
MyMap ptr = first;
while(ptr!= last.after)
{
System.out.println("Key: " +ptr.key+ " Value: " +ptr.value);
ptr = ptr.after;
}
}

public int delete(int key1)
{
	
	MyMap curr;
	MyMap prev;
	
	curr = first;
	prev =  null;
	if(key1==first.key)
	{
		first = curr.after;
		curr = null;
	}
	else if(key1==last.key)
	{
		MyMap temp1 ;
		MyMap prev1;
		temp1 = first;
		prev1=null;
		while(temp1.after!=null)
		{
			prev1 = temp1;
			temp1 =  temp1.after;
		}
		last = prev1;
		last.after = null;
		
	}
	else
	{
	
	while(curr!= null)
	{
		
	if(key1 == curr.key)
	{
		
		prev.after = curr.after;
		break;
		
	}
	prev = curr;
	curr=curr.after;
	}
	if(curr == null)
	{
		return -1;
	}
	}
	return 0;
}

public static void main(String arg[])
{

	MyMap obj= new MyMap();
	int var;
	System.out.println("1.Add element");
	System.out.println("2.Delete element");
	System.out.println("3.Get element");
	System.out.println("4.Print");
	System.out.println("5.Exit");
	Scanner in = new Scanner(System.in);
    var = in.nextInt();
	while(var!=5)
	{
		if(var==1)
		{
			System.out.println("Enter Key: ");
			Scanner i = new Scanner(System.in);
	        int key = i.nextInt();
	        System.out.println("Enter Value: ");
			Scanner ins = new Scanner(System.in);
	        int value = ins.nextInt();
	        
	        obj.put(key, value);
	        
		}
		else if(var==2)
		{
			System.out.println("Enter the key you want to delete");
			Scanner i = new Scanner(System.in);
	        int key = i.nextInt();
			if(obj.delete(key)!=-1)
				System.out.println("The element has been deleted ");
			else System.out.println("The element does not exist");
		}
		else if(var==4)
		{
			obj.display();
		}
		else if(var ==3)
		{
			System.out.println("Key : ");
			Scanner i = new Scanner(System.in);
	        int key = i.nextInt();
	        if(obj.get(key)!= -1)
	        {
	        System.out.println("The value is " + obj.get(key));
	        }
	        
	        else System.out.println("The element does not exist");
		}
		
		System.out.println("1.Add element");
		System.out.println("2.Delete element");
		System.out.println("3.Get element");
		System.out.println("4.Print");
		System.out.println("5.Exit");
		Scanner inp = new Scanner(System.in);
	    var = inp.nextInt();
		
	}
	

}

	

}

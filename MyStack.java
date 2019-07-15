package com.accolite.au.java;
import java.util.Scanner;
public class MyStack {

	int data;
	int pointer;
	int arr[]= new int[10];

	MyStack()
	{
		pointer=-1;
	}

	
	public int pop()
	{
		if(isEmpty()==0)
			return arr[pointer--];
		else 
			{
			System.out.println("Stack is empty");
			return -1;
			}
	}
	
	void push(int value)
	{
		
	if(isFull()==0)
		arr[++pointer]=value;
	
	else System.out.println("stack is full");
	}
	
	public int isEmpty()
	{
		if(pointer==0)
			return 1;
		else return 0;
	}
	
	public int isFull()
	{
		if(pointer>=9)
		{
			return 1;
		}
		else return 0;
	}
	
	public void printarray()
	{
		for(int i=0;i<=pointer;i++)
		{
			System.out.println(arr[i] +  " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack obj= new MyStack();
		int var;
		System.out.println("1.Add element");
		System.out.println("2.Delete element");
		System.out.println("3.Exit");
		System.out.println("4.Print");
		Scanner in = new Scanner(System.in);
        var = in.nextInt();
		while(var!=3)
		{
			if(var==1)
			{
				System.out.println("Enter element you want to add");
				Scanner i = new Scanner(System.in);
		        int val = i.nextInt();
		        obj.push(val);
		        
			}
			else if(var==2)
			{
				if(obj.pop()!=-1)
					System.out.println("The element deleted is " + obj.pop());
			}
			else if(var==4)
			{
				obj.printarray();
			}
			
			System.out.println("1.Add element");
			System.out.println("2.Delete element");
			System.out.println("3.Exit");
			System.out.println("4.Print");
			Scanner ins = new Scanner(System.in);
	       // String s = in.nextLine();
	        var = ins.nextInt();
			
		}
		
	
	}

}

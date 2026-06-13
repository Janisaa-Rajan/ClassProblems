package com.example.set;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ArrayList {
	 public static void main(String[] args)
		{
//			  String name = "Sachin"; name = name.concat(" Tendulkar");
//			  System.out.println(name);
//			 
			
			  LinkedList<String> list = new LinkedList<String>();
			  
			  list.add("Hello"); list.add("World"); list.add("Hello"); list.add(null);
			  list.add("Java");
			  
			  
			  System.out.println(list);
			  
			  
			  for(int i=0;i<list.size();i++) { System.out.print(list.get(i) + "  "); }
			  
			  System.out.println(); for(String s : list) { System.out.print(s + " "); }
			  System.out.println("\n ITERATOR :"); Iterator<String> itr = list.iterator();
			  while(itr.hasNext()) { System.out.println(itr.next()); }
			  
			  
			  System.out.println("LIST iterator"); 
			  ListIterator<String> litr = list.listIterator();
			   while(litr.hasNext()) { System.out.println(litr.next());
			  }
			  
			  
			  System.out.println("List iTERATE Backward"); while(litr.hasPrevious()) {
			  System.out.println(litr.previous()); }
			 
		 
		 
			
			  Vector<Integer> v = new Vector<Integer>(); v.addElement(1); v.addElement(2);
			  v.addElement(3); v.addElement(4);
			  
			  Enumeration<Integer> e = v.elements(); while(e.hasMoreElements()) {
			  System.out.println(e.nextElement()); }
			 
		 
		 Stack<Integer> s = new Stack<Integer>();
		 s.push(1);
		 s.push(2);
		 s.push(3);
		 s.push(4);
		 System.out.println(s);
		 System.out.println("Pop element " +s.pop());
		 System.out.println("Top Element " + s.peek());
	    }
      }
package com.custommap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookAuthorHashMap 
{
	public static void createAuthorNumberBookMap(ArrayList<Book> al)
	{
		HashMap<Author, Integer> authmap= new HashMap<>();
		
		Iterator<Book> itr= al.iterator();
		int count;		
		while(itr.hasNext())
		{
			count=1;
			Book b= itr.next();
			if(!authmap.containsKey(b.getAuthor()))
			{				
				authmap.put(b.getAuthor(), count);
			}
			else
			{
				count= authmap.get(b.getAuthor());
				authmap.put(b.getAuthor(), count+1);
			}
			
			
		}
		
		for(Map.Entry<Author, Integer> en: authmap.entrySet())
		{
			
			System.out.println(en.getKey().getAname()+" :"+en.getValue());
			
			System.out.println();
			System.out.println("===========================================================");
		}
		
		
	}
	
public static void createAuthorBook(ArrayList<Book> al)
{
	HashMap<Author, ArrayList<String>> authmap = new HashMap<>();
	
	Iterator<Book> itr = al.iterator();
	ArrayList<String> booklist;
	
	while(itr.hasNext())
	{
		Book b = itr.next();
		if(!authmap.containsKey(b.getAuthor()))
		{
			booklist = new ArrayList<>();
			//booklist.add(b.getName());
			//authmap.put(b.getAuthor(), booklist);
		}
		else
		{
			booklist = authmap.get(b.getAuthor());
			
		}
		booklist.add(b.getName());
		authmap.put(b.getAuthor(), booklist);
	}
	for(Map.Entry<Author, ArrayList<String>> en:authmap.entrySet())
	{
		System.out.println(en.getKey());
		System.out.println("Book List :");
		booklist = en.getValue();
		for(String s:booklist)
		{
			System.out.println(s+" ,");
		}
		System.out.println();
		System.out.println("====================");
	}
}

public static void createAuthorBookMap(ArrayList<Book> al)
{
	HashMap<Author, ArrayList<String>> authmap= new HashMap<>();
	
	Iterator<Book> itr= al.iterator();
	ArrayList<String> booklist;
	
	while(itr.hasNext())
	{
		Book b= itr.next();
		if(!authmap.containsKey(b.getAuthor()))
		{
			booklist= new ArrayList<>();
			//booklist.add(b.getBname());
			//authmap.put(b.getAuthor(), booklist);
		}
		else
		{
			booklist= authmap.get(b.getAuthor());
			//booklist.add(b.getBname());
			//authmap.put(b.getAuthor(), booklist);
		}
		booklist.add(b.getName());
		authmap.put(b.getAuthor(), booklist);
		
	}
	
	for(Map.Entry<Author, ArrayList<String>> en: authmap.entrySet())
	{
		
		System.out.println(en.getKey());
		System.out.println("Book List:");
		booklist= en.getValue();
		for(String s:booklist)
		{
			System.out.print(s+"  ");
		}
		System.out.println();
		System.out.println("===========================================================");
	}
	
	
}
	public static void main(String[] args) 
	{
		
		ArrayList<Book> bal = new ArrayList<>();
		
		bal.add(new Book("Harry potter",1001, 760f, new Author("J.K.Rowling",1)));
		bal.add(new Book("The christams pig",1002, 860f, new Author("J.K.Rowling",1)));
		bal.add(new Book("Fantastic beasts",1003, 7650f, new Author("J.K.Rowling",1)));
		
		bal.add(new Book("The clear blue sky",1004, 450f, new Author("Narayan Murthy",2)));
		bal.add(new Book("The better india a bettwe word",1005, 710f, new Author("Narayan Murthy",2)));
		
		bal.add(new Book("othello",1006, 350f, new Author("willam shekspier",3)));
		bal.add(new Book("The clear blue sky",1004, 450f, new Author("Narayan Murthy",2)));
		
		createAuthorBook(bal);
		System.out.println("******************");
		
		createAuthorNumberBookMap(bal);
		
		System.out.println("------------------");
		
		createAuthorBookMap(bal);
	}

}

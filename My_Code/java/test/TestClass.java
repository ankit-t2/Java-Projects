package test;
/*
 * Created on Nov 18, 2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */


/**
 * @author Ankit_Pancholi
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
import java.io.BufferedReader;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

interface NewInterface{}

class Gerbil 
{
	int gerbilNumber;

	public Gerbil(int i)
	{
		gerbilNumber = i;
	}
	
	public String toString()
	{
		return "Gerbil"+gerbilNumber;
	}
}

public class TestClass{
	static void printInfo(ArrayList cc) {
		for(Object str: cc)
		{
			System.out.println(str.getClass());
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		
//		printInfo(aList);
		Class ci = TestClass.class;
		try
		{
			Pattern p = Pattern.compile("(\\w+) \1");
		}
		catch (PatternSyntaxException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		Pattern p1 = Pattern.compile("^(\\w+) \\1$");
		Matcher mat = p1.matcher("Ankit Ankit");
		System.out.println(mat.groupCount());
		while(mat.find())
		{
			System.out.println("Found "+mat.group()+" at "+mat.start()+" ending at "+mat.end());
		}
		
	}
}

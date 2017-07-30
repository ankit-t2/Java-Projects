/*
 * Created on Jan 20, 2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

	public static void main(String[] args){

		Pattern pattern = Pattern.compile("\\GDog");
		int flags = Pattern.CASE_INSENSITIVE ;
		Matcher matcher = pattern.matcher("dogdog");

		boolean found = false;
		while (matcher.find()) {
			System.out.format("I found the text \"%s\" starting at " +
					"index %d and ending at index %d.%n",
					matcher.group(), matcher.start(), matcher.end());
			found = true;
		}
		if(!found){
			System.out.format("No match found.%n");
		}
	}
}


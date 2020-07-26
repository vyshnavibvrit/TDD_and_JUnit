package com.epam.TDD;

public class RemoveCharA
{
	public String remove(String s)
	{
		if(s.length()==0)
			return "";
		else if(s.length()==1)
		{
			if(s.charAt(0)=='A')
				return "";
			else
				return s;
		}
		String result = "";
		if(s.charAt(0)!='A')
			result = result + String.valueOf(s.charAt(0));
		if(s.charAt(1)!='A')
			result = result + String.valueOf(s.charAt(1));
		if(s.length()==2)
			return result;
		return result + s.substring(2);
	}
}
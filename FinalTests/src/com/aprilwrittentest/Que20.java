package com.aprilwrittentest;
//20) There is a collection with a page name and the number of times that page has been viewed.
//We need to print the names of the pages in descending order of pagename length .
//if page length is same then print in ascending order of alphabets.[1M]
//e.g. pagename sky,page,maze,laptop
//output- laptop,maze,page,sky

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class Que20  {
	int pageLen;
	String pageName;
	public Que20() {
		// TODO Auto-generated constructor stub
	}
	public Que20(int pageLen, String pageName) {
		super();
		this.pageLen = pageLen;
		this.pageName = pageName;
	}
	public int getPageLen() {
		return pageLen;
	}
	public void setPageLen(int pageLen) {
		this.pageLen = pageLen;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	@Override
	public String toString() {
		return "Que20 [pageLen=" + pageLen + ", pageName=" + pageName + "]";
	}
	public void createMap() {
		
		HashMap<String, Integer> map  = new HashMap<>();
		map.put("sky",3);
		map.put("maze",4);
		map.put("page",4);
		map.put("laptop",6);
		
		System.out.println(map);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(pageLen, pageName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Que20 other = (Que20) obj;
		return pageLen == other.pageLen && Objects.equals(pageName, other.pageName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que20 q = new Que20();
		q.createMap();
		
	}
	
	

}

package com.relevancelab.automation;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Test {

public static void main(String[] args) {
	System.out.println("HI it's a maven project");
	Test obj = new Test();
	obj.data();
	
}
void data(){
	JSONObject obj = null;
	Scanner rd = new Scanner(System.in);
	JSONArray user_list = new JSONArray();
	for(int i =1;i<=5;i++)
	{	
    obj=new JSONObject();
	System.out.println("Please enter the user name");
	obj.put("name", rd.nextLine());
	System.out.println("Please enter the user address");
	obj.put("address", rd.nextLine());
	System.out.println("Please enter the user phone number");
	obj.put( " phonenumber ", rd.nextLine());
	user_list.add(obj);
}

	System.out.print(user_list);
}

}

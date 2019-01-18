package String;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();*/
		String s="complete java classes karvenagar ";
		String temp="";
		char space=' ';
		String rev="";
		int count=1;
		/*if(s.charAt(0)!=space){
			count++;
		}*/
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=space)
			{
				temp+=s.charAt(i);	
			}
			else
			{
				if(count%2!=0)	
				{
					for(int j=temp.length()-1;j>=0;j--)
					{
						rev=rev+temp.charAt(j);
					}
					System.out.print(rev);
				}
				else
				{	
					System.out.print(temp);	
				}
				count++;
				rev=" ";
				temp=" ";
			}
				
		}
		
	}
}
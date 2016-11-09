
package helloworld;

import java.io.IOException;
import java.io.InputStreamReader;

/*
	작성일: 2016년 4월 5일
         작성자 : 안대혁
*/
public class Test {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int ch;
		while((ch = isr.read()) != -1 ){
			char c = (char)ch;
			System.out.print(c);
		}
	}
}
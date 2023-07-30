package com.sdk.main;
import com.sdk.model.SingletoneClass;
public class Main {

	public static void main(String[] args) {
		//SingletoneClass ref=new SingletoneClass();
		SingletoneClass ref=SingletoneClass.getSingletoneClass();
		System.out.println("counter value: "+ref.getcounter());
		for(int i=0;i<5;i++){
			ref=SingletoneClass.getSingletoneClass();
			System.out.printf("\n initial counter value=%d",ref.getcounter());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

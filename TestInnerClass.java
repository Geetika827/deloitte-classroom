package com.deloitte;
class Outer
{
	void outermethod()
	{
		System.out.println("from outer");
	}
	static class Inner
	{
		void innermethod()
		{
			System.out.println("from inner");
		}
	}
}
			
public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Outer outerObj=new Outer();
    outerObj.outermethod();
    Outer.Inner innerobj=new Outer.Inner();
    innerobj.innermethod();
	}

}

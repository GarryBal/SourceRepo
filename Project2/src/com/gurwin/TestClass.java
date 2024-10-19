package com.basic;

public class TestClass {
	
	public TestClass(int a, String s) {
		this(a);
		System.out.println("multi param const");		
	}
	public TestClass(int a) {
		System.out.println("single param const");
	}

	public static void process() throws Exception {
		try {
			// do something
		} catch (Exception e) {
			throw e;
		} finally {
			throw new Exception();
		}
	}

	void callMe(String a) {
		System.out.println("string");
	}

	void callMe(Object a) {
		System.out.println("object");
	}

	void callMe(Integer a) {
		System.out.println("integer");
	}

	public static void main(String[] args) {
		System.out.println("before process");
		try {
			process();
		} catch (Exception e) {
			System.out.println("inside catch e");
		}
		System.out.println("after process");

		TestClass tc = new TestClass(1, "AA");
		//tc.callMe(null);
	}

}

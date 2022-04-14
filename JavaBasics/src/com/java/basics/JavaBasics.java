package com.java.basics;

public class JavaBasics{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		HashtableDemo myHtable = new HashtableDemo();
		myHtable.hashTable();
		
		WhileLoopDemo myWhileLoop = new WhileLoopDemo();
		myWhileLoop.whileLoop();
		
		ForLoopDemo myForLoop = new ForLoopDemo();
		myForLoop.forLoop();
		
		DoWhileLoopDemo myDoWhileLoop = new DoWhileLoopDemo();
		myDoWhileLoop.doWhileLoop();
		
		ArrayListDemo myArrayList = new ArrayListDemo();
		myArrayList.arrayList();
		myArrayList.arrayListMethod();
		
		LinkedListDemo myLinkedList = new LinkedListDemo();
		myLinkedList.linkedList();
		
		RecursionDemo myRecursion = new RecursionDemo();
		myRecursion.recursion();
	
		StringBufferDemo myStringBuffer = new StringBufferDemo();
		myStringBuffer.stringBuffer();
		
		StringBuilderDemo myStringBuilder = new StringBuilderDemo();
		myStringBuilder.stringBuilder();
		
		InheritanceDemo2 myInheritance = new InheritanceDemo2();
		myInheritance.print_world();
		
		GetterSetterDemo myGetterSetter = new GetterSetterDemo();
		// Setting name by calling setter method
		myGetterSetter.setName("Getter & Setter Method!");
		// Getting name by calling getter method
		System.out.println(myGetterSetter.getName());
		System.out.println();
		
		//ExceptionsDemo myException = new ExceptionsDemo();
		//myException.exception();
		
		System.out.println("* Static Demo *");
		// Accessing the static method demo() and field by class name itself.
		StaticDemo.demo("Static Demo ex.");
		System.out.println(StaticDemo.demoName);
		// Accessing the static method demo() by using Object's reference.
		StaticDemo obj = new StaticDemo();
		obj.demo("2nd Static Demo ex.");
		System.out.println(obj.demoName);
		System.out.println();
		
		InterfaceDemo myInterface = new InterfaceDemo();
		myInterface.display();
		
		BreakDemo myBreak = new BreakDemo();
		myBreak.breakEx();
		
		ContinueDemo myContinuation = new ContinueDemo();
		myContinuation.continuation();
		
		SwitchDemo mySwitch = new SwitchDemo();
		mySwitch.switchDemo();
		
		FinallyDemo myFinally = new FinallyDemo();
		myFinally.finallyDemo();
		
		VectorDemo myVector = new VectorDemo();
		myVector.vectorDemo();
		
		IteratorDemo myIterator = new IteratorDemo();
		myIterator.iteratorDemo();
		
		SetDemo mySet = new SetDemo();
		mySet.setDemo();
		
		// create boxes using various constructors
		OverloadingDemo mybox1 = new OverloadingDemo(10, 20, 15);
		OverloadingDemo mybox2 = new OverloadingDemo();
		OverloadingDemo mycube = new OverloadingDemo(7);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume: " + vol);
		vol = mybox2.volume();
		System.out.println("Volume: " + vol);
		vol = mycube.volume();
		System.out.println("Volume: " + vol);
		System.out.println();
		
		// create object for method overloading class
		OverloadedMethodDemo om = new OverloadedMethodDemo();
		// calling method to add 2 numbers
		int sum1 = om.add(4, 5);
		System.out.println("Sum of 2 integers: " + sum1);
		// calling method to add 3 numbers
		int sum2 = om.add(4, 5, 6);
		System.out.println("Sum of 3 integers: " + sum2);
		System.out.println();
		
		SortingDemo mySorting = new SortingDemo();
		mySorting.arraySort();
		System.out.println();
		
		EncapsulationDemo capobj = new EncapsulationDemo();
		// setting values for the variables
		capobj.setName("Juliette");
		capobj.setAge(22);
		// displaying the values
		System.out.println("Name: " + capobj.getName());
		System.out.println("Age: " + capobj.getAge());
		System.out.println();
		

	}

}

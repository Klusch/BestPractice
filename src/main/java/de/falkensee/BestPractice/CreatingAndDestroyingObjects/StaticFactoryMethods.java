package de.falkensee.BestPractice.CreatingAndDestroyingObjects;

// GOOD
public class StaticFactoryMethods {

	private int parameter1;
	private String parameter2;
	
	/**
	 * Not using the constructor, instead a method with a good name 
	 * 
	 * @param parameter1
	 * @param parameter2
	 * @return
	 */
	public static StaticFactoryMethods createClassXYZ(int parameter1, String parameter2) {
		StaticFactoryMethods myStaticFactoryMethods = new StaticFactoryMethods();
		myStaticFactoryMethods.parameter1 = parameter1;
		myStaticFactoryMethods.parameter2 = parameter2;
		return myStaticFactoryMethods;
	}
	
}

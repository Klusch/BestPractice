package de.falkensee.BestPractice.CreatingAndDestroyingObjects;

// BAD
public class TelescopingConstructorPattern {

	private int param1, param2, param3;
	
	public TelescopingConstructorPattern(int param1) {
		this(param1, 0);
	}
	
	public TelescopingConstructorPattern(int param1, int param2) {
		this(param1, param2, 1);
	}

	public TelescopingConstructorPattern(int param1, int param2, int param3) {
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
	}
	
}

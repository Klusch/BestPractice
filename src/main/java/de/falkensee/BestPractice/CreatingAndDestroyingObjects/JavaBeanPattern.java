package de.falkensee.BestPractice.CreatingAndDestroyingObjects;

// BAD
public class JavaBeanPattern {

	private int param1, param2, param3;

	public JavaBeanPattern() {
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}

	public int getParam3() {
		return param3;
	}

	public void setParam3(int param3) {
		this.param3 = param3;
	}

}

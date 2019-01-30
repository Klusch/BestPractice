package de.falkensee.BestPractice.CreatingAndDestroyingObjects;

// GOOD
public class BuilderPattern {

	private final int param1, param2, param3;
	
	public static class Builder {
		
		// Required parameters
		private final int param1, param2;
		
		// Optional parameters
		private int param3 = 0;
		
		public Builder(int param1, int param2) {
			this.param1 = param1;
			this.param2 = param2;
		}
		
		public Builder param3(int val) {
			param3 = val;
			return this;
		}
		
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}
	
	private  BuilderPattern(Builder builder) {
		param1 = builder.param1;
		param2 = builder.param2;
		param3 = builder.param3;
	}
	
	public static void main(String args[]) {
		BuilderPattern myBuilderPattern = new BuilderPattern.Builder(0, 1).param3(2).build();
	}
	
}

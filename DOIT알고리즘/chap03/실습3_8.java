package chap03;

import java.util.Comparator;

class ½Ç½À3_8 {
	static class PhyscDate {
		private String name;
		private int height;
		private double vision;
		
		public PhyscDate (String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		public String toString() {
			return name + " " + height + " " + vision;
		}
		public static final Comparator<PhyscData> HEIGHT_ORDER = 	
				new HeightOrderComparator();
		
		private static class He
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

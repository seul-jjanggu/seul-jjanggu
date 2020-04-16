package D0414_workshop;
public class workshop_1 {
	public static void main(String[] args) {
		String[][] str = {
				{"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"},
				{"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"},
				{"E", "D", "D" ,"A", "C", "B", "E", "E", "A", "D"},
				{"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"},
				{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"}		
		};
		String[][] ans = {
				{"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"}
		};
	
		for(int i = 0; i < 5; i++ ) {
			int score = 0;
			for(int j = 0; j < 10; j++) {
				if(str[i][j].equals(ans[0][j])) {
					score++;	
				}				
			}
			System.out.println("The Student[" + (i+1) + "]'s Score is " + score);
		}
	}				
}


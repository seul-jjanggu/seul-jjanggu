package D0414_workshop;

public class workshop_1_sol {
	
	public static void main(String[] args) {
				String[] student1 = {"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"};
				String[] student2 = {"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"};
				String[] student3 = {"E", "D", "D" ,"A", "C", "B", "E", "E", "A", "D"};
				String[] student4 = {"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"};
				String[] student5 = {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"};		
				String[] answer = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
				
				grade(1, student1, answer);
				grade(2, student2, answer);
				grade(3, student3, answer);
				grade(4, student4, answer);
				grade(5, student5, answer);
	}
	static void grade(int num, String[] student, String[] answer) {
		int count = 0;
		for(int inx = 0; inx < answer.length; inx++ ) {
			if(student[inx] == answer[inx]) {
				count += 1;
				}				
			}
			System.out.println("The Student[" + num + "]'s Score is " + count);
	}
}

	


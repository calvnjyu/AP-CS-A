public class QuizScores {

	public static void displayAverage(int[] quizzes) {
		double totalSoFar = 0;
		for (int k = 0; k < quizzes.length; k++) {
			totalSoFar += quizzes[k];
		}
		System.out.println(totalSoFar/quizzes.length);
	}

	public static void findQuizzesBelow83(int[] quizzes) {
		for (int i = 0; i < quizzes.length; i++) {
			if (quizzes[i] < 83)
				System.out.println("Quiz " + i + ": " +
										quizzes[i]);
		}

	}
	
	public static void removeLowQuizScore(int[] quizzes) {
		int ind = 0;
		int min = quizzes[0];
		
		for(int i = 0; i < quizzes.length; i++) {
			if(min > quizzes[i]) {
				ind = i;
				min = quizzes[i];
			}
		}
		
		int[] newarr = new int[quizzes.length-1];
		for(int i = 0, k = 0; i < quizzes.length; i++) {
			if(i != ind) {
				newarr[k++] = quizzes[i];
			}
		}
		
		System.out.print("New array without the lowest score: ");
		for(int i : newarr) {
			System.out.print(i + " ");
		}
	}
	
	public static void displayDroppedAverage(int[] quizzes) {
		int min = quizzes[0];
		int sum = 0;
		
		for(int i = 0; i < quizzes.length; i++) {
			sum += quizzes[i];
			min = Math.min(min, quizzes[i]);
		}
		
		System.out.println((sum-min)/(quizzes.length-1));
	}
	
	public static void displayQuizGrades(int[] quizzes) {
		for(int i = 0; i < quizzes.length; i++) {
			System.out.println("Quiz " + i + ": " + quizzes[i]);
		}
	}

	public static void main(String[] inputs) {
		
		int[] quizzes = new int[8];
		for (int k = 0; k < quizzes.length; k++) {
			quizzes[k] = (int) (Math.random() * 31 + 70);
		}
		
		displayAverage(quizzes);
		displayQuizGrades(quizzes);
		findQuizzesBelow83(quizzes);
		displayDroppedAverage(quizzes);
		removeLowQuizScore(quizzes);
	}
	

}
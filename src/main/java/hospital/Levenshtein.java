package hospital;

import java.util.Arrays;

public class Levenshtein {
	public static int calculate(String x, String y) {
		int[][] dp = new int[x.length() + 1][y.length() + 1];

		for (int i = 0; i <= x.length(); i++) {
			for (int j = 0; j <= y.length(); j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else {
					dp[i][j] = min(dp[i - 1][j - 1] + costOfSubstitution(x.charAt(i - 1), y.charAt(j - 1)),
							dp[i - 1][j] + 1, dp[i][j - 1] + 1);
				}
			}
		}

		return dp[x.length()][y.length()];
	}

	public static int costOfSubstitution(char a, char b) {
		return a == b ? 0 : 1;
	}

	public static int min(int... numbers) {
		return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
	}
}
//implementation shown below:

//public static String typeGuesser(String userType, Scanner input) {
//	int organicGuess = Levenshtein.calculate(printCapitalizedVersion(userType), "Organic");
//	int roboticGuess = Levenshtein.calculate(printCapitalizedVersion(userType), "Robotic");
//	String guess;
//	while (true) {
//
//		if (organicGuess < roboticGuess) {
//			guess = "Organic";
//			break;
//		} else if (organicGuess > roboticGuess) {
//			guess = "Robotic";
//			break;
//		} else {
//			System.out.println("Please try again. Is your pet Organic or Robotic?");
//			userType = exitChecker(input.nextLine());
//		}
//		organicGuess = Levenshtein.calculate(printCapitalizedVersion(userType), "Organic");
//		roboticGuess = Levenshtein.calculate(printCapitalizedVersion(userType), "Robotic");
//	}
//	return guess;
//}
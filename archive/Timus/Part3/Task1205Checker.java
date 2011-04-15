package Timus.Part3;

import net.egork.utils.checker.Checker;
import net.egork.utils.io.InputReader;

public class Task1205Checker extends Checker {
	@Override
	public String check(InputReader input, InputReader expectedOutput, InputReader actualOutput) {
		return tokenCheck(expectedOutput, actualOutput);
	}

	@Override
	public double getCertainty() {
		return 1e-6;
	}
}


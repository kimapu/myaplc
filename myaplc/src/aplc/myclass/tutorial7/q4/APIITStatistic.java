package aplc.myclass.tutorial7.q4;

import java.util.Arrays;

public class APIITStatistic extends Statistic<Integer> {

	APIITStatistic(Integer[] arg) {
		super(arg);
		// TODO Auto-generated constructor stub
	}

	@Override
	Integer sum() {
		return (int)Arrays.stream(super.nums)
				.mapToDouble(Number::doubleValue)
				.sum();
	}

	@Override
	Integer avg() {
		return (int)Arrays.stream(super.nums)
				.mapToDouble(Number::doubleValue)
				.average()
				.getAsDouble();
	}

}

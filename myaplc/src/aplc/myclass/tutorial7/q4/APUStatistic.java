package aplc.myclass.tutorial7.q4;

import java.util.Arrays;

public class APUStatistic extends Statistic<Double> {

	public APUStatistic(Double[] arg)
	{
		super(arg);
	}
	
	@Override
	Double sum() {
		return Arrays.stream(super.nums)
				.mapToDouble(Number::doubleValue)
				//.reduce(0, (e1, e2) -> e1 + e2);
				.sum();
	}

	@Override
	Double avg() {
		return Arrays.stream(super.nums)
				.mapToDouble(Number::doubleValue)
				//.summaryStatistics().getAverage()
				.average()
				.getAsDouble();
	}

}

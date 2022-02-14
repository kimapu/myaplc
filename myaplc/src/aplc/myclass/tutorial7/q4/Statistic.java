package aplc.myclass.tutorial7.q4;

public abstract class Statistic<T extends Number>{
	T[] nums;
	Statistic(T[] arg){
		this.nums = arg;
	}
	abstract T sum();
	abstract T avg();
}


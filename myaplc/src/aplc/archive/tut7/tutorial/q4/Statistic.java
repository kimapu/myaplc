package aplc.archive.tut7.tutorial.q4;

public abstract class Statistic<T extends Number>{
	T[] nums;
	Statistic(T[] arg){
		this.nums = arg;
	}
	abstract T sum();
	abstract T avg();
}


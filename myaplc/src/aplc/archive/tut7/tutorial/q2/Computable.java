package aplc.archive.tut7.tutorial.q2;

public interface Computable<T, R>{
	R add(T i1, T i2);
	R sub(T i1, T i2);
	R mul(T i1, T i2);
	R div(T i1, T i2);
	R mod(T i1, T i2);
}

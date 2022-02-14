package aplc.myclass.tutorial7.q2;

public interface Computable<T, U, R>{
	R add(T i1, U i2);
	R sub(T i1, U i2);
	R mul(T i1, U i2);
	R div(T i1, U i2);
	R mod(T i1, U i2);
}

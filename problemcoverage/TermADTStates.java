import java.lang.annotation.*;
public class TermADTStates {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface State {
		public String state() default "";
	}
	@State(state="<>")
	public static TermADT state0() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<4x5>")
	public static TermADT state1() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<Pow>")
	public static TermADT state2() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<newCoef x newPow>")
	public static TermADT state3() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<x>")
	public static TermADT state4() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<Coef>")
	public static TermADT state5() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<c,p>")
	public static TermADT state6() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<c>")
	public static TermADT state7() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<p>")
	public static TermADT state8() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<t>")
	public static TermADT state9() {
		TermADT o = new TermIMP();
		// TODO Set initial state, if applicable
		return o;
	}
}

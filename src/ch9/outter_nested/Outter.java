package ch9.outter_nested;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
		
	}
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-methos");
		}
		void print() {
			System.out.println(this.field);
			System.out.println(Outter.this.field);
			this.method();
			Outter.this.method();
		}
	}
}

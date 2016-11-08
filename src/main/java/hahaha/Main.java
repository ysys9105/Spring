package hahaha;

public class Main {

	public static void main(String[] args) {
		// IS - A 관계 (is-a relationship)
		// 정의: subclass is a superclass
		// 역관계는 성립X (superclass is a subclass(x))
		// subclass의 type을 써야하는 곳에 superclass의 type을 쓸 수 있다
		
		//다형성: 하나의 객체를 다른 형태로 사용할 수 있게함
		
		Student a = new Student();
		Person b = new Student();
		Object c = new Student();

	}

}

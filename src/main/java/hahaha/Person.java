package hahaha;

public class Person {
	
	// 1. 변수 -> Field  
	// 2. 함수 -> Method
	// 3. 생성자 -> 만들어진 instance를 초기화 시켜주는 역할
	private int age; //객체지향 개념 중 information hiding 이라는 개념을 java언어에서
					 //access modifier 인 private로 구현
					 //단, 외부에서 해당 field를 제어하기 위해 getter or setter구현

	public Person(){
		//인자도 없고 하는일도 없는 생성자: default생성자
		//만들지 않아도 javac 컴파일러가 생성해줌 --> class에는 반드시 하나 이상의 생성자가 있음
	
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

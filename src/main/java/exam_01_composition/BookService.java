package exam_01_composition;

import java.util.ArrayList;

public class BookService {
	
	//Business Logic을 처리하는 method
	public ArrayList<BookEntity> getListByKeyword(String keyword) {


		// 로직처리 나옴
		// DB처리 나옴
		
		//객체가 다른 객체를 사용할 때 있어서 관계
		//서비스 객체가 자신의 method 내에서 다른 객체 (DAO)를 생성해서 사용.
		//Composition 관계에 있다고 얘기 함
		// 두개의 객체가 강하게 결합할 수 밖에 없음.(tightly coupled) <->(loosely coupled)
		//이러면 클래스를 재사용하기 힘들다. 유지보수 측면도 좋지 않음
		//우리가 하려는 객체지향 프로그램과 상반되는 모습.
		BookDAO dao = new BookDAO();
		ArrayList<BookEntity> list = dao.selectAll(keyword);
		return list;
	}
}

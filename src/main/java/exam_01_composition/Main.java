package exam_01_composition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// 1. 입력받고
		Scanner s = new Scanner(System.in);
		System.out.println("검색할 키워드 : ");
		String keyword = s.nextLine();
		
		// 2. 로직처리하고
		// 로직처리를 위한 Service 객체를 생성
		BookService service = new BookService();
		
		// 서비스를 이용해서 business logic을 수행
		ArrayList<BookEntity> list = service.getListByKeyword(keyword);
		
		// 3. 출력처리
		for(BookEntity entity : list){
			System.out.println(entity.getBtitle()+" : "+entity.getBauthor());
		}
		
		// 사용한 resource 해제
		s.close();
	}

}

package exam_02_beans_xml_tag;

import java.util.ArrayList;
import java.util.Map;

public class BookShelf {
	
	private String shelfName;
	private int shelfPrice;
	private ArrayList<BookEntity> list; //arrayList로되어있는책들
	private Map<Integer,BookEntity> map; //map으로 되어있는 책들
	
	public BookShelf(){
		
	}

	public BookShelf(int shelfPrice, ArrayList<BookEntity> list){
		this.shelfPrice = shelfPrice;
		this.list = list;
	}

	public String getShelfName() {
		return shelfName;
	}

	public void setShelfName(String shelfName) {
		this.shelfName = shelfName;
	}

	public int getShelfPrice() {
		return shelfPrice;
	}

	public void setShelfPrice(int shelfPrice) {
		this.shelfPrice = shelfPrice;
	}

	public ArrayList<BookEntity> getList() {
		return list;
	}

	public void setList(ArrayList<BookEntity> list) {
		this.list = list;
	}

	public Map<Integer, BookEntity> getMap() {
		return map;
	}

	public void setMap(Map<Integer, BookEntity> map) {
		this.map = map;
	}

}

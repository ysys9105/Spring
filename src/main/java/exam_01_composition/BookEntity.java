package exam_01_composition;

// DTO를 만들 수 있는 class
// Database를 근간으로해서 만들어요!
public class BookEntity {

	private String bisbn;
	private String btitle;
	private String bauthor;
	private int bprice;
//	private String bpublisher;
//	private String btranslator;
//	private String bimgurl;
//	private String bimgbase64;
	
	public BookEntity() {
		// Default 생성자는 사용을 하던 말던 무조건 만들기!

	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
}

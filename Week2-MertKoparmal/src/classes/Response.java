package classes;

public class Response {
	
	//Private Değişkenler ve Constructer Metotlar Oluşturuldu
	
	private String code;
	private String date;
	  
	public Response() {
	  
	}

	public Response(String code, String date) {
		this.code = code;
		this.date = date;
	}
	
	//Getter ve Setter'lar Oluşturuldu.

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}

package activities;

abstract class Book{
	String title;

	abstract void setTitle(String obj);

	String getTitle() {
	  return title;
     }
	
}

class MyBook extends Book{
	
	void setTitle(String obj) {
		title = obj;
	}

	
}

public class Activity5 {

    public static void main(String[] args) {
  		
  		MyBook newNovel = new MyBook();
  		newNovel.setTitle("Revolution 2020");
  		
  		System.out.println("Title of book is :" +newNovel.getTitle());

  	}
}





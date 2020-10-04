
public class Books 
{
	private String bookName;
	private String discription;
	private int chapters;
	
	public Books (String bookName, String discription, int chapters)
	{
		this.bookName = bookName;
		this.discription = discription;
		this.chapters = chapters;
	}
	
	public void display()
	{
		System.out.println(bookName + " has " + chapters + " chapters and is about " + discription);
	}

}

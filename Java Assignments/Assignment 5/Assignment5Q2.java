import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class News{
	int newsId; 
	String postedByUser; 
	String commentByUser; 
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
}

 public class Assignment5Q2 {
	    public static int maxComments(List<News> news) {
	    	news.stream().max(Comparator.comparing(News::getComment));
	    	List<Integer> it = new ArrayList<>();
	    	news.stream().forEach(i->{int id =i.getNewsId(); it.add(id);});
	    	int i=it.stream().findFirst().get();
			return i;
			}

	    public static int budgetCount (List < News > news) {
	    	news.stream().max(Comparator.comparing(News::getComment));
	    	List<String> name = new ArrayList<>();
	    	news.stream().forEach(i->name.add(i.getComment()));
	    	int count=0;
	    	for(String str:name) {
	    		if(str.contains("budget")) {
	    			count++;
	    		}
	    	}
			return count;
			}
	    public static String maxCommentsByUser (List < News > news) {
	    	news.stream().max(Comparator.comparing(News::getCommentByUser));
	    	List<String> name = new ArrayList<>();
	    	news.stream().forEach(i->name.add(i.getCommentByUser()));
	    	String maxcommentUser=name.stream().findFirst().get();
			return maxcommentUser;
			}

	    public static Map<Integer,String > sortMaxCommentsByUser (List < News > news) {
	    return null;
	    }

	    public static void main(String[] args) {
	    	News n1=new News(1,"Bibek","Chetan","Nice one!");
	    	News n2=new News(2,"Raj","Rahul","Great Job Done.");
	    	News n3=new News(3,"Shusmita","Saurav","Great work.");
	    	News n4=new News(4,"Gauri","Rahul","Congrats.");
	    	News n5=new News(5,"Rishab","Saurav","budget");
	    	News n6=new News(1,"Bibek","Saurav","Cool");
	    	News n7=new News(4,"Gauri","Saurav","Great Job Done.");
	    	News n8=new News(1,"Bibek","Rahul","Nice one!");
	    	News n9=new News(3,"Shusmita","Dev","budget");
	    	News n10=new News(5,"Rishab","Chetan","Congrats.");
	    	List<News> news=new ArrayList<>();
	    	news.add(n1);
	    	news.add(n2);
	    	news.add(n3);
	    	news.add(n4);
	    	news.add(n5);
	    	news.add(n6);
	    	news.add(n7);
	    	news.add(n8);
	    	news.add(n9);
	    	news.add(n10);
	    	System.out.println("NewsId which has recieved maximum comments:-");
	    	System.out.println(maxComments(news));
	    	System.out.println("the word 'budget' arrived in user comments all news:-");
	    	System.out.println(budgetCount(news));
	    	System.out.println("user that has posted maximum comments:-");
	    	System.out.println(maxCommentsByUser(news));
	    	//System.out.println(sortMaxCommentsByUser(news));
	    }
	}
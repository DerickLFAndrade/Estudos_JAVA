package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date date;
	private String title;
	private String content;
	private Integer like;
	
	private List<Comment> comment = new ArrayList<>();

	public Post(Date date, String title, String content, Integer like) {
		this.date = date;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	public void RemoveComment(Comment comment) {
		this.comment.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(like);
		sb.append(" Likes - ");
		sb.append(sdf.format(date) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n" );
		
		for(Comment c : comment ) {
			sb.append(c.getComment() + "\n");
		}
		
		return sb.toString();
	}
	
}

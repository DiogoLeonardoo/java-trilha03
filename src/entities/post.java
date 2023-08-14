package entities; 

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class post {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private String title;
    private String content;
    private Integer likes; 

    private List<comment> comments = new ArrayList<>();

    public post() {
    }

    public post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    } // end of constructor 

    public Date getMoment() {
        return moment;
    } // end of getMoment method

    public void setMoment(Date moment) {
        this.moment = moment;
    } // end of setMoment method

    public String getTitle() {
        return title;
    } // end of getTitle method

    public void setTitle(String title) {
        this.title = title;
    } // end of setTitle method

    public String getContent() {
        return content;
    } // end of getContent method

    public void setContent(String content) {
        this.content = content;
    } // end of setContent method

    public Integer getLikes() {
        return likes;
    } // end of getLikes method

    public void setLikes(Integer likes) {
        this.likes = likes;
    } // end of setLikes method
    
    public List<comment> getComments() {
        return comments;
    } // end of getComments method

    public void addComment(comment comment) {
        comments.add(comment);
    } // end of addComment method

    public void removeComment(comment comment) {
        comments.remove(comment);
    } // end of removeComment method

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(content + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (comment c : comments) { 
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}

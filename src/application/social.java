package application;
import entities.post;
import entities.comment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class social {
    
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        comment c1 = new comment("Have a nice trip!");
        comment c2 = new comment("Wow that's awesome!");
        post p1 = new post (
            sdf.parse("21/06/2018 13:05:44"),
            "Traveling to New Zealand",
            "I'm going to visit this wonderful country!",
            12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        post p2 = new post (
            sdf.parse("28/07/2018 23:14:19"),
            "Good night guys",
            "See you tomorrow",
            5);
        p2.addComment(new comment("Good night"));

    }
}

package edu.lehigh.cse216.pss324.backend.rows;

/**
 * DataRow holds a row of information.  A row of information consists of
 * an identifier, strings for a "title" and "content", and a creation date.
 * 
 * Because we will ultimately be converting instances of this object into JSON
 * directly, we need to make the fields public.  That being the case, we will
 * not bother with having getters and setters... instead, we will allow code to
 * interact with the fields directly.
 */
public class CommentRow {
    public int comment_id = -1;
    public int post_id = -1;
    public int user_id = -1;
    public String message = null;

    public CommentRow(int comment_id, int post_id, int user_id, String message) {
        this.comment_id = comment_id;
        this.post_id = post_id;
        this.user_id = user_id;
        this.message = message;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
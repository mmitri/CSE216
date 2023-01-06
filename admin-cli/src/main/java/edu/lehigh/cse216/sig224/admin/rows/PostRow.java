package edu.lehigh.cse216.sig224.admin.rows;

import java.util.ArrayList;

/**
 * DataRow holds a row of information. A row of information consists of
 * an identifier, strings for a "title" and "content", and a creation date.
 * 
 * Because we will ultimately be converting instances of this object into JSON
 * directly, we need to make the fields public. That being the case, we will
 * not bother with having getters and setters... instead, we will allow code to
 * interact with the fields directly.
 */
public class PostRow {
    int post_id = -1;
    String title = null;
    String message = null;
    int user_id = -1;
    boolean valid = true;
    ArrayList<CommentRow> comments = null;

    public PostRow(int id, String title, String message, int user_id, boolean valid) {
        this.post_id = id;
        this.title = title;
        this.message = message;
        this.user_id = user_id;
        this.valid = valid;

    }

    public PostRow(int id, String title, String message, int user_id, boolean valid, ArrayList<CommentRow> comments) {
        this.post_id = id;
        this.title = title;
        this.message = message;
        this.user_id = user_id;
        this.valid = valid;
        this.comments = comments;
    }

    /**
     * @return int
     */
    public int getPostId() {
        return post_id;
    }

    /**
     * @param id
     */
    public void setPostId(int id) {
        this.post_id = id;
    }

    /**
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return int
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return boolean
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
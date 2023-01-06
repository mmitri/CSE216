package edu.lehigh.cse216.sig224.admin.rows;

/**
 * DataRow holds a row of information. A row of information consists of
 * an identifier, strings for a "title" and "content", and a creation date.
 * 
 * Because we will ultimately be converting instances of this object into JSON
 * directly, we need to make the fields public. That being the case, we will
 * not bother with having getters and setters... instead, we will allow code to
 * interact with the fields directly.
 */
public class ProfileRow {
    int id = -1;
    String name = null;
    String email = null;
    String gender = null;
    String sexual_orientation = null;
    String note = null;
    boolean valid = true;

    public ProfileRow(int id, String name, String email, String gender, String sexual_orientation, String note,
            boolean valid) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.sexual_orientation = sexual_orientation;
        this.note = note;
        this.valid = valid;
    }

    /**
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return String
     */
    public String getSexual_orientation() {
        return sexual_orientation;
    }

    /**
     * @param sexual_orientation
     */
    public void setSexual_orientation(String sexual_orientation) {
        this.sexual_orientation = sexual_orientation;
    }

    /**
     * @return String
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return boolean
     */
    public boolean getValid() {
        return valid;
    }
}
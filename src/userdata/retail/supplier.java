package userdata.retail;

public class supplier {
    private int ID;
    private String name;
    private int contact;
    private String email;

    public supplier(int ID, String name, int contact, String email) {
        this.ID = ID;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "supplier [ID=" + ID + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
    }

}

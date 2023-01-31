package entities.concretes;

public class Braches {

    private int id;
    private String branche;

    public Braches() {
    }

    public Braches(int id, String branche) {
        this.id = id;
        this.branche = branche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", branche='" + branche + '\'' ;
    }
}

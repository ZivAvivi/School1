public class Actor {
    private String id;
    private String gender;
    private int numFilms;

    public Actor(String id, String gender, int numFilms){
        this.gender = gender;
        this.id = id;
        this.numFilms = numFilms;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setGender(String Gender){
        this.gender = Gender;
    }

    public void setNumFilms(int numFilms){
        this.numFilms = numFilms;
    }

    public int getNumFilms(){
        return numFilms;
    }

    public String getId(){
        return id;
    }

    public String getGender(){
        return gender;
    }

    public int compare(Actor other){
        if (this.numFilms > other.numFilms)
            return 1;
        if (this.numFilms < other.numFilms)
            return 2;
        return 3;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", numFilms=" + numFilms +
                '}';
    }
}

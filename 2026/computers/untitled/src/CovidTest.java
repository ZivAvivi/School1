public class CovidTest {
    private String name;
    private String id;
    private int cityCode;
    private boolean sick;

    public CovidTest(String name, String id, int cityCode, boolean sick) {
        this.name = name;
        this.id = id;
        this.cityCode = cityCode;
        this.sick = sick;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public boolean isSick() {
        return sick;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + id + ", " + cityCode + ", " + sick +'}';

    }
}

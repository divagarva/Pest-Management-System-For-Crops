public class Crop {
    private int cropId;
    private String name;
    private String type;
    private String season;

    public Crop(int cropId, String name, String type, String season) {
        this.cropId = cropId;
        this.name = name;
        this.type = type;
        this.season = season;
    }

    // Getters and setters
    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Crop ID: " + cropId + ", Name: " + name + ", Type: " + type + ", Season: " + season;
    }
}

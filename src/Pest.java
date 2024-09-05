public class Pest {
    private int pestId;
    private String name;
    private String affectedCrops;
    private String treatment;
    private String treatmentSchedule;

    public Pest(int pestId, String name, String affectedCrops, String treatment, String treatmentSchedule) {
        this.pestId = pestId;
        this.name = name;
        this.affectedCrops = affectedCrops;
        this.treatment = treatment;
        this.treatmentSchedule = treatmentSchedule;
    }

    // Getters and setters
    public int getPestId() {
        return pestId;
    }

    public void setPestId(int pestId) {
        this.pestId = pestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffectedCrops() {
        return affectedCrops;
    }

    public void setAffectedCrops(String affectedCrops) {
        this.affectedCrops = affectedCrops;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatmentSchedule() {
        return treatmentSchedule;
    }

    public void setTreatmentSchedule(String treatmentSchedule) {
        this.treatmentSchedule = treatmentSchedule;
    }

    @Override
    public String toString() {
        return "Pest ID: " + pestId + ", Name: " + name + ", Affected Crops: " + affectedCrops +
                ", Treatment: " + treatment + ", Treatment Schedule: " + treatmentSchedule;
    }
}

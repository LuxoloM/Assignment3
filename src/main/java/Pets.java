public class Pets {


    private String petName;
    private int petWeight;
    private boolean sold;
    private String petSound;

    public Pets() {
    }

    public Pets(String petName, int petWeight, boolean sold, String petSound) {
        this.petName = petName;
        this.petWeight = petWeight;
        this.sold = sold;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(int petWeight) {
        this.petWeight = petWeight;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getPetSound() {
        return petSound;
    }

    public void setPetSound(String petSound) {
        this.petSound = petSound;
    }
}

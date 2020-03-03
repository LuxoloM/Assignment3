public class Dog extends Pets{

    public Dog() {
    }

    public Dog(String petName, int petWeight, boolean sold, String petSound) {
        super(petName, petWeight, sold, petSound);
    }

    //public String petSound(){
      //  return "whoof";
    //}

    @Override
    public void setPetName(String petName) {
        super.setPetName(petName);
    }

    @Override
    public void setPetWeight(int petWeight) {
        super.setPetWeight(petWeight);
    }

    @Override
    public boolean isSold() {
        return super.isSold();
    }

    @Override
    public void setSold(boolean sold) {
        super.setSold(sold);
    }

    @Override
    public void setPetSound(String petSound) {
        super.setPetSound(petSound);
    }

    @Override
    public String getPetName() {
        return super.getPetName();
    }

    @Override
    public int getPetWeight() {
        return super.getPetWeight();
    }

    @Override
    public String getPetSound() {
        return super.getPetSound();
    }
}

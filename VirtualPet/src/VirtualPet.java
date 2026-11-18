// Part A

public class VirtualPet {
    private String name;
    private int energy;
    private int happiness;
    private int weight;
    private int ageY;
    private int ageM;
    public VirtualPet(String aName){
        this.name = aName;
        this.energy = 0;
        this.happiness = 0;
        this.weight = 0;
        this.ageY = 0;
        this.ageM = 0;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name + "'s information: \n Energy: " + energy + "\n Happiness: " + happiness + "\n Weight: " + weight + "\n Age: " + ageM + "months and " + ageY + " years";
    }
    public void feed(){
        weight++;
        energy++;
        if(energy >10){
            energy = 10;
        }
    }
    public int getEnergyLevel(){
        return energy;
    }
    public int getHappinessLevel(){
        return happiness;
    }
    public void play(){
        happiness++;
        if(happiness > 10){
            happiness = 10;
        }
        weight--;
        if(weight < 5){
            weight = 5;
        }
    }
    public void updateStatus(){
        happiness--;
        energy--;
        ageM++;
        if(happiness<0){
            happiness = 0;
        }
        if(energy<0){
            energy = 0;
        }
        if(ageM>12){
            ageY++;
            ageM =0;
        }
    }
}

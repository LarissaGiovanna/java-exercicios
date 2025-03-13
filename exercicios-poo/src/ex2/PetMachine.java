package ex2;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShower(){
        if (this.pet == null){
            System.out.println("Nenhum pet selecionado. Coloque o pet na máquina para iniciar o banho.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("Pet " + pet.getName() + " está limpo.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Máquina cheia.");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 30) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina não está limpa. Limpe a máquina antes de adicionar um pet.");
            return;
        }
        if (this.pet != null) {
            System.out.println("Já existe um pet na máquina. Retire o pet atual para adicionar um novo.");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("Pet " + this.pet.getName() + " removido da máquina e está limpo");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Máquina limpa.");
    }
}

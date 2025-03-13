package ex2;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        var option = -1;
        
        do
        {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Adicionar água");
            System.out.println("3 - Adicionar shampoo");
            System.out.println("4 - Verificar água");
            System.out.println("5 - Verificar shampoo");
            System.out.println("6 - Adicionar pet");
            System.out.println("7 - Retirar pet");
            System.out.println("8 - Verificar se tem pet");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            
            switch(option){
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 ->{
                    var amount = petMachine.getWater();
                    System.out.println("Quantidade de água: " + amount + " litros");
                }
                case 5 ->{
                    var amount = petMachine.getShampoo();
                    System.out.println("Quantidade de shampoo: " + amount + " litros");
                }
                case 6 -> setPetInPetmachine();
                case 7 -> petMachine.removePet();
                case 8 -> checkIfHasPetInMachine();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
            
        }while(option!=0);
        
    }
    private static void setWater(){
        System.out.println("Tentando adicionar água na máquina.");
        petMachine.addWater();
    }
    private static void setShampoo(){
        System.out.println("Tentando adicionar shampoo na máquina.");
        petMachine.addShampoo();
    }

    public static void setPetInPetmachine(){
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Digite o nome do pet:");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado na máquina.");
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }
    
}

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating different configurations of Computer using Builder pattern
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("Asus ROG")
                .setPowerSupply("750W")
                .setCaseType("Mid Tower")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated")
                .setMotherboard("Gigabyte B450")
                .setPowerSupply("500W")
                .setCaseType("Mini Tower")
                .build();

        System.out.println("Gaming PC Configuration: " + gamingPC);
        System.out.println("Office PC Configuration: " + officePC);
    }
}

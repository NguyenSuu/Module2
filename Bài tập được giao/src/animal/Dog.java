package animal;

public class Dog extends Pet implements ILicensable {
    private License license;
    public Dog(String name,License license) {
        super(name);
        this.license=license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public void speak() {
        System.out.println("woof...woof...");
    }
    @Override
    public License getLicense() {
        return null;
    }
}

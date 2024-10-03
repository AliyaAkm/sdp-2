class AppleFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
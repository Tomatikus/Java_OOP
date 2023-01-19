package Seminars.seminar_1;


public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
       vendingMachine.getProductList().add(new Product("Яблоко", 10));
        vendingMachine.getProductList().add(new Product("Груша", 20));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.getProductList().add(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 10.4324324234234, TypeSize.BIG));
        vendingMachine.getProductList().add(new Marmalade("Marmalade", 30, 0.5));
        vendingMachine.getProductList().add(new Pepsi("Pepsi", 45, 0.9 ));
        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }


}
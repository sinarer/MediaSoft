public static void main(String[] args) {
    BankAccount Alice = new BankAccount("Alice");
    BankAccount Vova = new BankAccount("Vova");

    System.out.println(Alice.deposit(100));
    System.out.println(Alice.withdraw(30));
    System.out.println(Alice.withdraw(300));
    System.out.println(Alice.transfer(Vova, 50));
    System.out.println(Alice.transfer(Vova, 400));

    System.out.println(Alice);
    System.out.println(Vova);
    System.out.println(Alice.equals(Vova));
}

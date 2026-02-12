import java.time.LocalDateTime;
import java.util.Random;


public class BankAccount {
    String name;
    int balance;
    LocalDateTime date;
    boolean block;
    int number;

    static final Random rand = new Random();

//конструктор
    public BankAccount(String ownerName) {
        this.name = ownerName;
        this.balance = 200;
        this.date = LocalDateTime.now();
        this.block = false;
        this.number = generateAccountNumber();
    }

    //генерация номера счёта
     int generateAccountNumber() {
         return rand.nextInt(100000000);
     }

    //пополнение счёта
    public boolean deposit(int amount) {
        if (block) return false;
        if (amount <= 0) return false;

        balance += amount;
        System.out.println(balance);
        return true;
    }

    //cнятие денег
    public boolean withdraw(int amount) {
        if (block) return false;
        if (amount <= 0 || amount > balance) return false;

        balance -= amount;
        System.out.println(balance);
        return true;
    }

    //перевод денег на другой счёт
    public boolean transfer(BankAccount otherAccount, int amount) {
        if (otherAccount == null) return false;
        if (this.block || otherAccount.block) return false;
        if (amount <= 0 || amount > this.balance) return false;

        this.balance -= amount;
        otherAccount.balance += amount;
        System.out.println("Ваш аккаунт: " + this.balance + "; Другой аккаунт: " + otherAccount.balance);
        return true;
    }
//сравнение счетов
    public boolean equals(BankAccount otherAccount) {
        return (this == otherAccount);
    }
// вывод информация
    public String toString() {
        if (!block) {
            return "BankAccount {" +
                    "Имя счета: " + name +
                    ", баланс на счёту: " + balance +
                    ", номер счёта: " + number +
                    ", время создания:" + date +
                    ", счет не заблокирован }";
        }
        return "Счёт недоступен";
    }



}

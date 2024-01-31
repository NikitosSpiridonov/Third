//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int check = 500; // счет клиента
        int deposit = 2000; // пополнение

        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = check + deposit + bonus;
        System.out.println("Ваш счет : " + balance + " рублей");
        System.out.println("Ваш бонус : " + bonus + " рублей");
    }
}

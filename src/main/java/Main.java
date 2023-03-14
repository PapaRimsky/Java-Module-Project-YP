// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int countPerson;
        String line;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите количество человек, на которых нужно разделить счет");
            line = scanner.next();
            try {
                countPerson = Integer.parseInt(line.trim());
                if(countPerson<=1){
                    System.out.println("Нужно ввести число больше 1");
                }else{
                    break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Нужно ввести целое число");
            }
        }
        Item item = new Item(scanner);
        Calculate calculate = new Calculate();
        Format formatter = new Format();
        while(true) {
            calculate.add(item.getName(),item.getPrice());
            System.out.println("Товар успешно добавлен");
            System.out.println("Введите слово \"Завершить\" для расчета. Если хотите продолжить, введите любой символ");
            line = scanner.next();
            if(line.equalsIgnoreCase("Завершить")){
                System.out.println("Список товаров:");
                System.out.println(calculate.productList);
                break;
            }
        }
        System.out.printf("Итог - %s\n",formatter.price(calculate.finalPrice));
        System.out.printf("Сумма с каждого - %s ",formatter.price(calculate.finalPrice/(float)countPerson));
        System.out.println(formatter.ruble(calculate.finalPrice/(float)countPerson));
    }
}
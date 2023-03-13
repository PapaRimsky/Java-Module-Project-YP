import java.util.Scanner;
public class Item {

    Scanner scanner = new Scanner(System.in);
    String getName(){
        System.out.println("Введите название товара");
        return scanner.next().trim();
    }
    float getPrice(){
        while(true){
            System.out.println("Введите стоимость товара в формате: \"10.45, 1205.80\"");
            String line = scanner.next().trim();
            try {
                float numb=Float.parseFloat(line.trim());
                if(numb>0){
                    return numb;
                }else{
                    System.out.println("Стоимость товара должна быть больше 0");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Неверный ввод числа");
            }
        }
    }
}

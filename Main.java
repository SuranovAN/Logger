import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        logger.log("Введи пожалуйста 2 числа через пробел(Размер списка и верхнюю границу значений)");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String str = scanner.nextLine();
        String[] tmpArr = str.trim().split(" ");
        List<Integer> list = new ArrayList<>();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < Integer.parseInt(tmpArr[0]); i++) {
            list.add(random.nextInt(Integer.parseInt(tmpArr[1])));
        }

        logger.log("Вот случайный список" + list.toString());
        logger.log("Просим пользователя ввести данные для фильтрации(число)");
        str = scanner.nextLine();
        int f = Integer.parseInt(str);
        Filter filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        List<Integer> resultList = filter.filterOut(list);
        logger.log("Результат фильтрации " + resultList);
        logger.log("Завершаем программу");
    }
}

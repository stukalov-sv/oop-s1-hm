import java.io.FileWriter;
import java.util.logging.Logger;

/**
 * Реализовать абстрактный класс Продукт, добавить ему какие-то параметры. 
 * Реализовать несколько наследников от класса Продукт со своими параметрами, конструкторами и переопределяющие метод toString
 * Реализовать класс Торговый автомат инициализирующий в дефолном конструкторе несколько коллекция содержащих наследников класса Продукт
 * Реализовать несколько методов возвращающий наследника класса(использовать разных наследников) Продукт по какому признаку
 * В отдельном классе Main, реализовать пример и использования торгового автомата 
 * (Создать автомат - запросить продукт по критерию - вывести полученный продукт в лог)
 */

public class Main {
    public static void main(String[] args) {
        logging("Alenka");
        logging("Lindt");
        logging("Cone forest");
        logging("Moscow potatoes");
        logging("black");
        logging("120");
        logging("0.5");
        logging(90);
        logging(22.5);
        logging(17.5);
        logging(9.5);
    }

    public static void logging (String content) {
        VendingMashine vm = new VendingMashine();
        Logger logger = Logger.getAnonymousLogger();
        
        try {
            FileWriter write = new FileWriter("log.txt", true);

            if (vm.getProductByName(content) == null) {
                if (vm.getByType(content) == null) {
                    if (isNumber(content)) {
                        if (vm.getByWeight(content) == null) {
                            write.write(String.valueOf(vm.getByType(content)) + "\n");
                        } else if (vm.getByWeight(content) != null) {
                            write.write(String.valueOf(vm.getByWeight(content)) + "\n");
                        } 
                    } else if (isDouble(content)) {
                        if (vm.getByVolume(content) == null) {
                            write.write(String.valueOf(vm.getByType(content)) + "\n");
                        } else if (vm.getByVolume(content) != null) {
                            write.write(String.valueOf(vm.getByVolume(content)) + "\n");
                        }
                    } else {
                        write.write(String.valueOf(vm.getByType(content)) + "\n");
                    }
                } else {
                    write.write(String.valueOf(vm.getByType(content)) + "\n");
                }
            } else {
                write.write(String.valueOf(vm.getProductByName(content)) + "\n");
            }       
            write.flush();
            write.close();
        } catch (Exception ex) {
            logger.warning(ex.getMessage());
        }   
        
    }

    public static void logging(Double content) {
        VendingMashine vm = new VendingMashine();
        Logger logger = Logger.getAnonymousLogger();

        try {
            FileWriter write = new FileWriter("log.txt", true);
            if (vm.getProductByCost(content) == null) {
                if (vm.getByVolume(content) == null) {
                    write.write(String.valueOf(vm.getByVolume(content)) + "\n");
                } else {
                    write.write(String.valueOf(vm.getByVolume(content)) + "\n");
                }
            } else {
                write.write(String.valueOf(vm.getProductByCost(content)) + "\n");
            }
            write.flush();
            write.close();
        } catch (Exception ex) {
            logger.warning(ex.getMessage());
        } 
    }

    public static void logging(Integer content) {
        VendingMashine vm = new VendingMashine();
        Logger logger = Logger.getAnonymousLogger();
        
        try {
            FileWriter write = new FileWriter("log.txt", true);
            if (vm.getByWeight(content) == null) {
                write.write(String.valueOf(vm.getByWeight(content)) + "\n");
            } else {
                write.write(String.valueOf(vm.getByWeight(content)) + "\n");
            }
            write.flush();
            write.close();
        } catch (Exception ex) {
            logger.warning(ex.getMessage());
        }
    }

    private static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

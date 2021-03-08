import utility.MenuUtil;
import utility.Util;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        while (true) {
            int operation = Util.requireIntegerNumber("Please select \"1\" - for Student operation or \"2\" - for Teacher operation " +
                    "or \"3\" to Exit:");
            switch (operation) {
                case 1:
                    MenuUtil.showMenuStudent();
                    break;
                case 2:
                    MenuUtil.showMenuTeacher();
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have shosen wrong operation! Please try again.");
            }
        }
    }
}

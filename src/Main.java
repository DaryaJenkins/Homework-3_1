public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();

            System.out.println();
            int bonusMiles = service.calculate(16_723);
            System.out.println(bonusMiles + " бонусных миль");

            System.out.println();
            int bonusMiles2 = service.calculate(6_000);
            System.out.println(bonusMiles2 + " бонусных миль");

            System.out.println();
            int bonusMiles3 = service.calculate(268_238);
            System.out.println(bonusMiles3 + " бонусных миль");
        }
    }
public class BonusMilesService {

    public int calculate(int cost) {
        int milesBonus = 20;
        int miles = cost / milesBonus;

        return miles;
    }
}

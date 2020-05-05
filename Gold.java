public class Gold {
    private static int gold;
    public int getGold() {
        return gold;
    }

    public Gold(int init){
        gold = init;
    }

    public void changeGold(int diff){
        if (gold + diff < 0){
            System.out.print("Vous n'avez pas pas assez d'argent."+ "\n");
        }
        else
            gold = gold + diff;

    }

}

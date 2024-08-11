//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightMetre = 1.87;
        int miles = service.index(weightKg, heightMetre);
        System.out.println(miles);
    }
}
//Код отформатирован.
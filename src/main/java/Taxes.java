public class Taxes {

    private double incomes;
    private double expanses;

    public Taxes(double incomes, double expanses) {
        this.incomes = incomes;
        this.expanses = expanses;
    }
    public void increaseIncomes (double income) {
        if (income < 0) {
            System.out.println("Неверное значение");
        }
        else {
            incomes = incomes + income;
        }

    }
    public void increaseExpanses (double expanse) {
        if (expanse < 0) {
            System.out.println("Неверное значение");
        }
        else {
            expanses = expanses + expanse;
        }

    }
    public double getTaxSixPercent () {
        return incomes * 6 / 100;
    }

    public double getTax15Percent () {
        if (incomes < expanses) {
            return 0;
        }
        else {
            return (incomes - expanses) * 15 / 100;
        }
    }
}

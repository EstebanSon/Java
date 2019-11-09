class Calculator{
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

}

class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("End");
    }
}
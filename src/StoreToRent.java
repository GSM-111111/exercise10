public class StoreToRent {
    // 私有常量 INTEREST_RATE，值为 0.25
    private final double INTEREST_RATE = 0.25;
    // 私有变量
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    // 带有三个参数的构造函数
    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    // INTEREST_RATE 的 getter 方法
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    // loanRequired 的 getter 方法
    public boolean isLoanRequired() {
        return loanRequired;
    }

    // loanAmount 的 getter 方法
    public double getLoanAmount() {
        return loanAmount;
    }

    // loanPaymentTerm 的 getter 方法
    public int getLoanPaymentTerm() {
        return loanPaymentTerm;
    }

    // 计算贷款融资的方法
    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        } else {
            return 0;
        }
    }

    // toString 方法（假设返回基本的商店信息）
    @Override
    public String toString() {
        return "StoreToRent details";
    }
}

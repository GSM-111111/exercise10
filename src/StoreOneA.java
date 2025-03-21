public class StoreOneA extends StoreToRent {
    // 私有常量 DISCOUNT_RATE，假设值为 0.1（文件中未指定具体值）
    private final double DISCOUNT_RATE = 0.1;
    // 私有变量
    private boolean specialCustomer;
    private double monthlyPayment;

    // 构造函数，包含父类的三个参数加上 specialCustomer
    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm); // 调用父类构造函数
        this.specialCustomer = specialCustomer;
        this.monthlyPayment = calculateLoanFinancing();   // 初始化 monthlyPayment
    }

    // 重写父类的 calculateLoanFinancing 方法
    @Override
    public double calculateLoanFinancing() {
        double monthlyPayment = super.calculateLoanFinancing(); // 调用父类方法
        if (specialCustomer) {
            monthlyPayment -= monthlyPayment * DISCOUNT_RATE;   // 特殊客户应用折扣
        }
        this.monthlyPayment = monthlyPayment;                   // 更新字段
        return monthlyPayment;                                  // 返回结果
    }

    // 显示商店信息的方法
    public void showStoreInfo() {
        System.out.println(toString());
    }

    // 重写 toString 方法，组合父类和子类的信息
    @Override
    public String toString() {
        String parentString = super.toString();
        String loanDetails = "";
        if (isLoanRequired()) { // 如果需要贷款，添加贷款详情
            loanDetails = "\nLOAN DETAILS:\n" +
                          "Loan Amount: " + getLoanAmount() + "\n" +
                          "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
                          "Interest Rate: " + getInterestRate() + "\n" +
                          "Special Customer: " + specialCustomer + "\n" +
                          "Monthly Loan Payment: " + monthlyPayment;
        }
        return parentString + loanDetails;
    }
}


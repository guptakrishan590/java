import java.math.BigDecimal;

public class TestSalarySlip {

	public static void main(String[] args) {
		SalarySlip e1=new SalarySlip("kRiSh kUmAr gUpTa", new BigDecimal( "10000000000.0"));
		System.out.println(e1.print());
		System.out.println("\n#################################################\n");
		e1.setSalary(new BigDecimal("100.0"));
		System.out.println(e1.print());
}
}

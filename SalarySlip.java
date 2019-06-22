import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class SalarySlip {
private BigDecimal salary ;
private String name;


public BigDecimal getSalary() {
	return salary;
}
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
SalarySlip(String name,BigDecimal salary){
	this.salary=salary;
	this.name=StringUtils.tittleCase(name);
}
private BigDecimal hra(){
	BigDecimal hraValue = new BigDecimal("0.3");
	return(salary.multiply(hraValue));
}
private BigDecimal da(){
	BigDecimal daValue = new BigDecimal("0.2");
	return salary.multiply(daValue);
	}
private BigDecimal ta(){
	BigDecimal taValue = new BigDecimal("0.1");
	return(salary.multiply(taValue));
}
private BigDecimal pf(){
	BigDecimal pfValue = new BigDecimal("0.05");
	return(salary.multiply(pfValue));
}
private BigDecimal gs(){
	return(salary.add(hra()).add(da()).add(ta()).subtract(pf()));
}
private BigDecimal tax(){
	BigDecimal taxValue = new BigDecimal("0.1");
	return(gs().multiply(taxValue));
}
private BigDecimal ns(){
	return(gs().subtract(tax()));
}
private String nf(BigDecimal a) {
	Locale locale = new Locale("hi","IN");
	NumberFormat nf  =  NumberFormat.getCurrencyInstance(locale);
	return(nf.format(a));
}
public String print() {

	return "Name is "+name+"\nBasic Salary is "+nf(salary)+"\nHRA is "+nf(hra())+"\nDA is "
			+nf(da())+"\nTA is "+nf(ta())+"\nPF is "+nf(pf())+"\nGross Salary is "+nf(gs())
			+"\nTax is "+nf(tax())+"\nNet Salary is "+nf(ns());
}
}
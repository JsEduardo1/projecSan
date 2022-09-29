package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	protected Boolean exclusivePlan;
	protected Double saldo;
	private Integer number;
	private Date date;
	
	public Account() {
	}

	public Account(String name, Boolean exclusivePlan, Double saldo, Integer number, Date date) {
		this.name = name;
		this.exclusivePlan = exclusivePlan;
		this.saldo = saldo;
		this.number = number;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getexclusivePlan() {
		return exclusivePlan;
	}

	public void setexclusivePlan(Boolean exclusivePlan) {
		this.exclusivePlan = exclusivePlan;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void feeWithdraw(double amount) {
		if(amount<= 100 || Boolean.logicalAnd(exclusivePlan, true)) {
			saldo -= amount;
		}
		else if (amount > 100 && amount <= 300) {
			saldo -= amount +(amount * 0.4/100);
		}
		else if(amount > 300) {
			saldo -= amount +(amount * 1/100);
		}
	}

	
	public void depositVolue(double amount) {
		saldo += amount;
	}
	
	public String toString() {
		return "Name: "
			   + name
			   + ", exclusive plan: "
			   + exclusivePlan
			   + ", saldo: $ "
			   + String.format("%.2f", saldo)
			   + ", account number: "
			   + number
			   + ", birth date: "
			   + sdf.format(date);
			   
	}
	
}

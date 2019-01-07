package com.cg.plp.bean;

public class PolicyCreationBean {
	private String insuredName;
	private String insuredStreet;
	private String insuredCity;
	private String insuredState;
	private int insuredZip;
	private String businessSegment;
	private double accountNo;
	private String agentName;
	private int policyPremium;
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredStreet() {
		return insuredStreet;
	}
	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}
	public String getInsuredCity() {
		return insuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}
	public String getInsuredState() {
		return insuredState;
	}
	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}
	public int getInsuredZip() {
		return insuredZip;
	}
	public void setInsuredZip(int insuredZip) {
		this.insuredZip = insuredZip;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public int getPolicyPremium() {
		return policyPremium;
	}
	public String setPolicyPremium(int policyPremium) {
		this.policyPremium = policyPremium;
		return null;
	}
	
}

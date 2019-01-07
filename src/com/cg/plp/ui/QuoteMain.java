package com.cg.plp.ui;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.NewPolicyCreationBean;
import com.cg.plp.bean.PolicyBean;
import com.cg.plp.bean.PolicyCreationBean;
import com.cg.plp.bean.PolicyQuestions;
//import com.cg.plp.bean.UserCreationBean;
import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.service.IQuoteService;
import com.cg.plp.service.QuoteServiceImpl;

public class QuoteMain {

	static Scanner sc=new Scanner(System.in);
	static UserLoginBean userLoginBean=null;
	static AccountCreationBean accountCreationBean=null;
	static PolicyCreationBean policyCreationBean=null;
	static PolicyQuestions policyQuestions=null;
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException
	
	
	{
		while(true) 
		
		{
		
			
			
		System.out.println("*******************Welcome To Online Insurance Quote Generation****************");
		System.out.println("Login Id:");
		String id=sc.next();
		System.out.println("Password:");
		String pass=sc.next();
		//System.out.print("1.user\t 2.Agent\t 3.Admin");
		userLoginBean=new UserLoginBean();
		userLoginBean.setLoginId(id);
		userLoginBean.setPassword(pass);
		
		IQuoteService iQuoteService=new QuoteServiceImpl();
		
		int role_code=iQuoteService.checkValidLogin(userLoginBean);
		System.out.println(role_code);
		
//		if(role_code!=1 || role_code!=2 || role_code!=3) 
//		{
//		
//		System.out.println("Details Not found!!!!!");
//		System.out.println("Do You Want To Create a new Profile\n1.Yes \n2.No");
//		int option0=sc.nextInt();
//		switch(option0)
//		{
//		
//				case 1:
//					System.out.println("Enter the following details:-> ");
//					System.out.println("Login Id:");
//					String id0 = sc.next();
//					System.out.println("Password:");
//					String pass0 = sc.next();
//					int role0 = 1;
//					userLoginBean.setLoginId(id0);
//					userLoginBean.setPassword(pass0);
//					userLoginBean.setRoleCode(role0);
//					iQuoteService.profileCreation(userLoginBean);
//
//					break;
//
//				case 2:
//					System.exit(0);
//					break;
//		}
		
		
	//}
		if( role_code==1) {
			System.out.println("Welcome User!!!");
			System.out.println("1.Account creation");
			System.out.println("2.View Policy");
			
			
			System.out.println("Enter your option: ");
			int option1=sc.nextInt();
			switch(option1) {
			
			case 1:
			
			System.out.println("Enter the following details:-> ");
			System.out.println("Insured Name: ");
			String name=sc.next();
			AccountCreationBean accountCreationBean=new AccountCreationBean();
			accountCreationBean.setInsuredName(name);
			//accountCreationBean.setInsuredName(sc.next());
			System.out.println("Insured Street: ");
			accountCreationBean.setInsuredStreet(sc.next());
			System.out.println("Insured City: ");
			accountCreationBean.setInsuredCity(sc.next());
			System.out.println("Insured State: ");
			accountCreationBean.setInsuredState(sc.next());
			System.out.println("Insured Zip: ");
			accountCreationBean.setInsuredZip(sc.nextInt());
			
			System.out.println("Business Segment: ");
			System.out.println("Please enter from the following options:\n1.Vehicle\n2.Shop\n3.Apartment");
			int segment=sc.nextInt();
			
			
			switch(segment)
			{
			case 1:
				String segment1="Vehicle";
				accountCreationBean.setBusinessSegment(segment1);
				break;
			case 2:
				String segment2="Shop";
				accountCreationBean.setBusinessSegment(segment2);
				break;
			case 3:

				String segment3="Apartment";
				accountCreationBean.setBusinessSegment(segment3);
				break;
			}
			
			
			
			//accountCreationBean.setBusinessSegment(sc.next());a
			
			System.out.println("Account Number: ");
			accountCreationBean.setAccountNo((double)(Math.random()*100000000));
			
			iQuoteService.accountCreation(accountCreationBean);
			break;
			
			case 2:
				List<PolicyBean> li = new ArrayList<>();
				String userName = null;
				System.out.println(" enter username to get policies");
				userName = sc.next();
				iQuoteService = new QuoteServiceImpl();
				li = iQuoteService.getMyPolicies(userName);
				
				break;
				
			}
			
		}
		
		if(role_code==2) {
			System.out.println("Agent Priviledges Granted!!!");
			System.out.println("1.Account creation");
			System.out.println("2.Policy creation");
			System.out.println("3.View Policy");
			
			System.out.println("Enter your option: ");
			int option2=sc.nextInt();
			switch(option2) {
			
			case 1:
			
			System.out.println("Enter the following details:-> ");
			System.out.println("Insured Name: ");
			String name=sc.next();
			AccountCreationBean accountCreationBean=new AccountCreationBean();
			accountCreationBean.setInsuredName(name);
			//accountCreationBean.setInsuredName(sc.next());
			System.out.println("Insured Street: ");
			accountCreationBean.setInsuredStreet(sc.next());
			System.out.println("Insured City: ");
			accountCreationBean.setInsuredCity(sc.next());
			System.out.println("Insured State: ");
			accountCreationBean.setInsuredState(sc.next());
			System.out.println("Insured Zip: ");
			accountCreationBean.setInsuredZip(sc.nextInt());
			
			System.out.println("Business Segment: ");
			System.out.println("Please enter from the following options:\n1.Vehicle\n2.Shop\n3.Apartment");
			int segment=sc.nextInt();
			
			
			switch(segment)
			{
			case 1:
				String segment1="Vehicle";
				accountCreationBean.setBusinessSegment(segment1);
				break;
			case 2:
				String segment2="Shop";
				accountCreationBean.setBusinessSegment(segment2);
				break;
			case 3:

				String segment3="Apartment";
				accountCreationBean.setBusinessSegment(segment3);
				break;
			}
			
			
			
			//accountCreationBean.setBusinessSegment(sc.next());a
			
			System.out.println("Account Number: ");
			accountCreationBean.setAccountNo((double)(Math.random()*100000000));
			
			iQuoteService.accountCreation(accountCreationBean);
			break;
			
			case 2:
				
				iQuoteService=new QuoteServiceImpl();
				List<PolicyQuestions> policyList = new ArrayList<PolicyQuestions>();
				policyList=iQuoteService.retrieveAll();
			
				//if (policyList != null) {
					Iterator<PolicyQuestions> i = policyList.iterator();
					while (i.hasNext())
					{
						PolicyQuestions policyQuestions=new PolicyQuestions();
						policyQuestions = i.next();
						System.out.println(policyQuestions.getQuesDesc());
				
				
			
				break;
					}
			case 3:
				System.out.println("view my customers policies");
				iQuoteService = new QuoteServiceImpl();
				List<PolicyBean> li = new ArrayList<PolicyBean>();
				System.out.println("enter your agent id");
				int agentId = sc.nextInt();
				li = iQuoteService.getMyCustomerPolicies(agentId);
				
				break;
		}
		}
		if(role_code==3)
		{
			System.out.println("Admin Priviledges Granted!!!");
			System.out.println("1.New Profile creation");
			System.out.println("2.Account creation");
			System.out.println("3.Policy creation");
			System.out.println("4.View Policy");
			System.out.println("5.Report generation");
			System.out.println("0.Exit");
			
			System.out.println("Enter your option: ");
			int option3=sc.nextInt();
			
			
			
			switch(option3)
			{
				case 1:
					System.out.println("Enter the following details:-> ");
					System.out.println("Login Id:");
					String id1=sc.next();
					System.out.println("Password:");
					String pass1=sc.next();
					System.out.println("Role Code:");
					int role1=sc.nextInt();
					userLoginBean.setLoginId(id1);
					userLoginBean.setPassword(pass1);
					userLoginBean.setRoleCode(role1);
					iQuoteService.profileCreation(userLoginBean);
					break;
			
				case 2:
					System.out.println("Enter the following details:-> ");
					System.out.println("Insured Name: ");
					String name=sc.next();
					AccountCreationBean accountCreationBean=new AccountCreationBean();
					accountCreationBean.setInsuredName(name);
					//accountCreationBean.setInsuredName(sc.next());
					System.out.println("Insured Street: ");
					accountCreationBean.setInsuredStreet(sc.next());
					System.out.println("Insured City: ");
					accountCreationBean.setInsuredCity(sc.next());
					System.out.println("Insured State: ");
					accountCreationBean.setInsuredState(sc.next());
					System.out.println("Insured Zip: ");
					accountCreationBean.setInsuredZip(sc.nextInt());
					
					System.out.println("Business Segment: ");
					System.out.println("Please enter from the following options:\n1.Vehicle\n2.Shop\n3.Apartment");
					int segment=sc.nextInt();
					
					
					switch(segment)
					{
					case 1:
						String segment1="Vehicle";
						accountCreationBean.setBusinessSegment(segment1);
						break;
					case 2:
						String segment2="Shop";
						accountCreationBean.setBusinessSegment(segment2);
						break;
					case 3:

						String segment3="Apartment";
						accountCreationBean.setBusinessSegment(segment3);
						break;
					}
					
					
					
					//accountCreationBean.setBusinessSegment(sc.next());a
					
					System.out.println("Account Number: ");
					accountCreationBean.setAccountNo((double)(Math.random()*100000000));
					
					iQuoteService.accountCreation(accountCreationBean);
					
					break;
				case 3:
					policyCreationBean=new PolicyCreationBean();
					
					iQuoteService=new QuoteServiceImpl();
					List<PolicyQuestions> policyList = new ArrayList<PolicyQuestions>();
					policyList=iQuoteService.retrieveAll();
				
					//if (policyList != null) {
						Iterator<PolicyQuestions> i = policyList.iterator();
						while (i.hasNext())
						{
							PolicyQuestions policyQuestions=new PolicyQuestions();
							policyQuestions = i.next();
							System.out.println(policyQuestions.getQuesDesc());
//							
//							System.out.println(policyQuestions.getAns1());
//							System.out.println(policyQuestions.getAns2());
//							System.out.println(policyQuestions.getAns3());
//							System.out.println(policyQuestions.getAns4());
////							syso
//							System.out.println(policyQuestions.getPol_Ques_Ans2_weightage());
//
//							System.out.println(policyQuestions.getPol_Ques_Ans3_weightage());
//							System.out.println(policyQuestions.getPol_Ques_Ans4_weightage());
							System.out.println("options available are "+policyQuestions.getAns1()+","+policyQuestions.getAns2()+","+policyQuestions.getAns3()+","+policyQuestions.getAns4());
							System.out.println("choose 1 / 2 / 3 / 4");
							int answer=0;
							answer = sc.nextInt();
							int premium=5000;
							switch(answer) {
							case 1:
								premium += Integer.parseInt(policyQuestions.getPol_Ques_Ans1_weightage());
								System.out.println(premium);
								iQuoteService = new QuoteServiceImpl();
								String prem = policyCreationBean.setPolicyPremium(premium);
								break;
							case 2:
								
								premium += Integer.parseInt(policyQuestions.getPol_Ques_Ans2_weightage());
								System.out.println(premium);
								break;
							case 3:
								premium +=Integer.parseInt(policyQuestions.getPol_Ques_Ans3_weightage());
								System.out.println(premium);
								break;
							case 4:
								premium +=Integer.parseInt(policyQuestions.getPol_Ques_Ans4_weightage());
								System.out.println(premium);
								break;
								
								}
						//	System.out.println(i);
//							System.out.println(i.next());
							
							
							
						//System.out.println(i.next().getBusSegId().equals("1"));
						if(i.next().getBusSegId().equals("1"))
						{
							//policyCreationBean.setPolicyPremium(1000);
							if(i.next().getQuesDesc().equals("VehicleType"))
							{
								System.out.println("hi in segment 1");
							}
							else if(i.next().getQuesDesc().equals("Vehicle Condition"))
							{
								
							}
							else if(i.next().getQuesDesc().equals("Daily Travelling Dist"))
							{
								
							}
							else if(i.next().getQuesDesc().equals("Vehicle Type"))
							{
								
							}
							
						}
						else if(i.next().getBusSegId().equals("2"))
						{
							//policyCreationBean.setPolicyPremium(5000);
						
						
						}
						else if(i.next().getBusSegId().equals("3"))
						{
							//policyCreationBean.setPolicyPremium(10000);
						
						
						}
						}
						break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					System.exit(0);
					break;
			
			
			
			}
			
			
			
		}	
			
			
			
		}
		
		
	}
}
	


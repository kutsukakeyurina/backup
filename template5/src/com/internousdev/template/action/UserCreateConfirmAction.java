package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	/**
	 *
	 */
	/**
	 *
	 */
	private static final long serialVersionUID = 876288890082877522L;
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object>session;
	private String result;
	private String errorMassage;

	/**
	 * 入呂情報格納処理
	 */
	public String execute(){
		result=SUCCESS;

		if(!(loginUserId.equals(""))&& !(loginPassword.equals(""))&& !(userName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
		}else{
			setErrorMassage("未入力の項目があります。");
			result=ERROR;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginUserId;
	}
	public void setLoginPassword(String loginPassword){
		this.loginUserId=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public String getErrorMassage(){
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage){
		this.errorMassage=errorMassage;
	}
}

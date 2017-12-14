package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
/**
	 *
	 */
	private static final long serialVersionUID = 1L;

/**
 * ログインボタン押下時に実行
 * ログイン画面へ遷移します。
 *
 * @return SUCCESS
 */
	public String execute(){
		return SUCCESS;
	}
}

package hello.mapper;

import java.sql.Timestamp;

public class UserInfo {
	private int id;
	private String userid;
	private String passwd;
	private String name;
	private int failCnt;
	private Timestamp lastLoginTime;
	private Timestamp createTime;
	private Timestamp passwdChangeTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFailCnt() {
		return failCnt;
	}
	public void setFailCnt(int failCnt) {
		this.failCnt = failCnt;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getPasswdChangeTime() {
		return passwdChangeTime;
	}
	public void setPasswdChangeTime(Timestamp passwdChangeTime) {
		this.passwdChangeTime = passwdChangeTime;
	}
	
}

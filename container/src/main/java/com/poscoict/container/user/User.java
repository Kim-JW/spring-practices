package com.poscoict.container.user;

import java.util.List;

public class User {
	private String name = "김재웅";
	private Long no = 0L;	
	private Friend friend;
	private List<String> friends;
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.name = name;
		this.no = no;
	}
	
	public User(Long no, String name, Friend friend) {
		this.name = name;
		this.no = no;
		this.friend = friend;
	}
	

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(Long no) {
		this.no = no;
	}
	

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", no=" + no + ", friend=" + friend + ", friends=" + friends + "]";
	}

	
}

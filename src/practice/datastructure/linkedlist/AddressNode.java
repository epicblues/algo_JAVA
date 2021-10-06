package practice.datastructure.linkedlist;

public class AddressNode {
	private String name;
	private String phone;
	private String email;
	public AddressNode link;
	
	public AddressNode(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.link = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressNode [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
}

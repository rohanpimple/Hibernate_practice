package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class data {
    @Id
	int kid;
	String name;
	String address;
	int yop;
	
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public data(int kid, String name, String add, int yop) {
		this.kid = kid;
		this.name = name;
		this.address = add;
		this.yop = yop;
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "data [kid=" + kid + ", name=" + name + ", address=" + address + ", yop=" + yop + "]";
	}
	
	
}

package pojo;

public class Pojo {
	String description;
	String leader;
	String address;
	String name;
	int ranking;
	public Pojo(String description, String leader, String address, String name, int ranking) {
		super();
		this.description = description;
		this.leader = leader;
		this.address = address;
		this.name = name;
		this.ranking = ranking;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
		
	

}


public class Worker {
	public String name = "Default Name";
	
	public Integer printName(){
		System.out.println(name);
		return 1;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
}

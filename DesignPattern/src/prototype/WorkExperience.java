package prototype;


//工作经历类
 class WorkExperience implements Cloneable{
	private String workDate;
	private String company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//创建当前对象的浅表副本，即浅复制
	public Object clone(){
		Object object = null;
		try{
			object = super.clone();
		}catch(CloneNotSupportedException e){
			System.err.println("not cloneable");
		}
		return object;
	}
}

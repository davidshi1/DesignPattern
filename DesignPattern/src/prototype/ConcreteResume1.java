package prototype;

class ConcreteResume1 extends Resume implements Cloneable{

	private String name;
	private int age;
	private String gender;
	// 引用工作经历对象
	private WorkExperience we;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	// 在简历类1实例化时同时实例化"工作经历"
	public ConcreteResume1(String name) {
		this.name = name;
		we = new WorkExperience();
	}

	// 设置个人信息
	public void SetPersonInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	// 设置工作经历
	public void SetWorkExperience(String workDate, String company) {
		we.setWorkDate(workDate);
		we.setCompany(company);
	}

	// 显示
	public void Display() {
		System.out.println("Name:" + getName() + " Age:" + getAge() + " Gender:" + getGender());
		System.out.println("WorkExperience:" + we.getWorkDate() + " " + we.getCompany());
	}
	
	//浅复制
	@Override
	public Resume Clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("not cloneable");
		}
		return (Resume) object;
	}

}

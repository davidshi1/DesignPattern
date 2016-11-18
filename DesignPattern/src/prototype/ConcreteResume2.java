package prototype;

class ConcreteResume2 extends Resume {

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
	public ConcreteResume2(String name) {
		this.name = name;
		we = new WorkExperience();
	}
	
	//提供Clone方法调用的私有构造函数，以便克隆"工作经历"的数据
	private ConcreteResume2(WorkExperience we) {
		this.we = (WorkExperience) we.clone();
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
		System.out.println("Name:" + getName() + " Age:" + getAge() + "Gender:" + getGender());
		System.out.println("WorkExperience:" + we.getWorkDate() + " " + we.getCompany());
	}
	
	//深复制
	@Override
	public Resume Clone() {
		ConcreteResume2 obj = new ConcreteResume2(this.we);
		obj.name = this.name;
		obj.age = this.age;
		obj.gender = gender;
		return obj;
	}

}


#原型模式
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

***结构图***

![image](https://github.com/shishengjia/DesignPattern/blob/master/Pic/Prototype.jpg)

**浅复制**

**深复制**

**示例代码**
```java
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
```

```java
abstract class Resume {
	public abstract Resume Clone();
}
```

```java
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
```

```java
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
```

```java
//测试类
public class Test {

	public static void main(String[] args) {
		ConcreteResume1 cr1 = new ConcreteResume1("shishengjia");
		cr1.SetPersonInfo(22, "男");
		cr1.SetWorkExperience("2016-8-26", "Google");
		
		ConcreteResume1 cr1_2 = (ConcreteResume1) cr1.Clone();
		cr1_2.SetWorkExperience("2015-8-26", "Baidu");
		
		cr1.Display();
		cr1_2.Display();
		
		System.out.println("=========================");
		
		ConcreteResume2 cr2 = new ConcreteResume2("shishengjia");
		cr2.SetPersonInfo(22, "男");
		cr2.SetWorkExperience("2016-8-26", "Google");
		
		ConcreteResume2 cr2_2 = (ConcreteResume2) cr2.Clone();
		cr2_2.SetWorkExperience("2015-8-26", "Baidu");
		
		cr2.Display();
		cr2_2.Display();
		
 //		Name:shishengjia Age:22 Gender:男
//		WorkExperience:2015-8-26 Baidu
//		Name:shishengjia Age:22 Gender:男
//		WorkExperience:2015-8-26 Baidu
//		=========================
//		Name:shishengjia Age:22Gender:男
//		WorkExperience:2016-8-26 Google
//		Name:shishengjia Age:22Gender:男
//		WorkExperience:2015-8-26 Baidu
	}

}
```


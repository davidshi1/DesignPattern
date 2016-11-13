
#原型模式
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

需要注意的是，对于clone()方法，如果字段是值类型，则对该字段进行逐位复制，如果字段是引用类型，则复制引用但不复制引用的对象。因此，原始对象及其副本引用同一对象。所以，类中如果有对象引用，要想克隆，必须自己实现clone()方法，进行深复制。

另外需要注意的是String是一种拥有值类型特点的特殊引用类型。

***结构图***

![image](https://github.com/shishengjia/DesignPattern/blob/master/Pic/Prototype.jpg)

| 区别           |               |       
| ------------ |:------------| 
| 深复制      | 被复制对象的所有变量都含有与原来的对象相同的值，而所用的对其他对象的引用都仍然指向原来的对象 |
| 浅复制      | 把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象 | 

**示例代码**
```java
//工作经历类，实现Cloneable接口
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
	
	//创建当前对象的浅表副本，即浅复制,这里的字段都是String，是引用类型，但拥有值类型的特点，所以没什么影响
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
//抽象简历类
abstract class Resume {
	public abstract Resume Clone();
}
```

```java
//具体简历类1，进行浅复制
class ConcreteResume1 extends Resume implements Cloneable{

	private String name;
	private int age;
	private String gender;
	private WorkExperience we;// 引用工作经历对象

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
	
	//浅复制，直接调用clone()方法，这是对于we引用对象，只复制其引用，数据是不会被克隆过来的
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
//具体简历类2，进行深复制
class ConcreteResume2 extends Resume {

	private String name;
	private int age;
	private String gender;
	private WorkExperience we;// 引用工作经历对象

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
		ConcreteResume2 obj = new ConcreteResume2(this.we);//调用私有的构造方法，让"工作经历"完成克隆，然后再对其余相关字段赋值，最终返回一个深复制的简历对象
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

从测试结果中可以看出，对于浅复制的简历类1，将第一个对象的克隆赋值给第二个对象后，并修改第二个对象的工作经历，第一个对象的工作经历也跟着变化，因为这两个对象中的"工作经历"都指向同一个对象。而实现深复制的简历类2则不会出现这种情况


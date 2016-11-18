package prototype;

//²âÊÔÀà
public class Test {

	public static void main(String[] args) {
		ConcreteResume1 cr1 = new ConcreteResume1("shishengjia");
		cr1.SetPersonInfo(22, "ÄÐ");
		cr1.SetWorkExperience("2016-8-26", "Google");
		
		ConcreteResume1 cr1_2 = (ConcreteResume1) cr1.Clone();
		cr1_2.SetWorkExperience("2015-8-26", "Baidu");
		
		cr1.Display();
		cr1_2.Display();
		
		System.out.println("=========================");
		
		ConcreteResume2 cr2 = new ConcreteResume2("shishengjia");
		cr2.SetPersonInfo(22, "ÄÐ");
		cr2.SetWorkExperience("2016-8-26", "Google");
		
		ConcreteResume2 cr2_2 = (ConcreteResume2) cr2.Clone();
		cr2_2.SetWorkExperience("2015-8-26", "Baidu");
		
		cr2.Display();
		cr2_2.Display();
		
		
//		Name:shishengjia Age:22 Gender:ÄÐ
//		WorkExperience:2015-8-26 Baidu
//		Name:shishengjia Age:22 Gender:ÄÐ
//		WorkExperience:2015-8-26 Baidu
//		=========================
//		Name:shishengjia Age:22Gender:ÄÐ
//		WorkExperience:2016-8-26 Google
//		Name:shishengjia Age:22Gender:ÄÐ
//		WorkExperience:2015-8-26 Baidu

		
	}

}

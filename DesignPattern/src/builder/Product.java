package builder;

import java.util.ArrayList;
import java.util.List;

class Product {

	List<String> parts = new ArrayList<String>();

	// 添加部件
	public void Add(String part) {
		parts.add(part);
	}

	// 展示产品
	public void show() {
		System.out.println("\n产品 创建 ---");
		for (int i = 0; i < parts.size(); i++)
			System.out.print(parts.get(i));
	}
}

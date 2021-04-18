class Pro34_test {
	public static void main(String[] args) {
		Outer.method().show();					//叫做链式编程
		//按照要求补全代码
	}
}

interface Inter {
	public void show();
}

class Outer {
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("返回了匿名子类对象，接着重写了show调用了show");
			}
		};
	}
}
class Pro34_test {
	public static void main(String[] args) {
		Outer.method().show();					//������ʽ���
		//����Ҫ��ȫ����
	}
}

interface Inter {
	public void show();
}

class Outer {
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("����������������󣬽�����д��show������show");
			}
		};
	}
}
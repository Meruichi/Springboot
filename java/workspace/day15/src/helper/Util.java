package helper;

	// SingleTon
	public class Util {
			// 싱글톤 객체 생성을 위한 준비 시작
		private static Util current;
		
		public static Util getInstance() {
			if(current == null) {current = new Util();}
			return current;
		}
			public static void freeInstance() {current = null;}
			private Util() {super();}
			// 싱글톤 객체 생성을 위한 준비 끝
			
			// 이 클래스가 구현해야 하는 기능

		public int random(int min, int max) {
			int num = (int)((Math.random() *(max - min + 1)) + min);
			return num;
			}
	}



	package ch07.sec11;
	
	/*
	 * 앞에서 Manager 클래스에서 non-sealed를 통해 봉인해제 시켜줬기 때문에
	 * Director 클래스에 상속이 가능함
	 */
	public class Director extends Manager{
		@Override
		public void work() {
			System.out.println("제품을 기획합니다.");
			
		}
	
	}

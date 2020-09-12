import java.util.*;

public class RandomNameMaker {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String[] animal = {"호랑이", "귀거북", "코원숭이", "바다뱀", "수염고래"};
			String[] place = {"타워", "의 길", "의 집", "경기장", "의 댄스무대"};
			String[] etc = {"전용 청소기", "의 몽둥이", "속 귀신", "도둑", "의 사랑"};
			
			System.out.println("랜덤작명");
			int choice = 1;
			while(choice != 4) {
				System.out.print("항목을 선택하세요 (1.동물 2.장소 3.기타 4.종료): ");
				choice = sc.nextInt();
				String word;
				int randomIndex = (int)(Math.random()*5); 
			
				switch(choice) {
				case 1 : System.out.print("아무 명사 하나를 입력해주세요 : "); 
							word = sc.next(); 
							System.out.println("결과 : "+word.concat(animal[randomIndex])); break;
							
				case 2 : System.out.print("아무 명사 하나를 입력해주세요 : ");
							word = sc.next(); 
							System.out.println("결과 : "+word.concat(place[randomIndex])); break;
							
				case 3 : System.out.print("아무 명사 하나를 입력해주세요 : ");
							word = sc.next(); 
							System.out.println("결과 : "+word.concat(etc[randomIndex])); break;
				
				case 4 : System.out.print("프로그램을 종료합니다"); return;
				default : System.out.println("잘못된 입력입니다"); break;
				}
			}
	}
}
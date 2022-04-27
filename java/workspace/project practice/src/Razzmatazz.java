import java.util.*;

// 난이도조절
// 7칸 << 최소 49 + 2,  51    6칸 << 최소 36 + 3,  39
// 5칸의 최대(5칸 + 4칸) : 25 + 16 = 41.  최소6칸인 39의 값보다 많아짐 ( + 6,2,1칸의경우 36+4+1=41 같은경우도 있으므로 배제도 불가)
/* 서로같은배열을 check하는 경우의수를 제거 > 6칸최소 25, 5칸최대 25 같아짐. 이렇게 한다한들
 *  하지만 어차피 39와 41사이 가능한 경우의수가 없음. 5칸 2칸 2칸 >> 33, 5칸 3칸 1칸 >> 35
 *  7칸 최소 check = 49 , 6칸최소 check = 39,  5칸최대 check = 41
 *  for(int i = 0; i<3; i++) {for(int j = 0; j<3; j++) {for(int l = 0; l<3; l++)
 *  {for(int k = 0; k<3; k++) {if( ar[i][j] == ar[l][k]){check++;}}}}};
*/

public class Razzmatazz {
	private static Scanner sc, sc1, sc2, sc3, sc4;
	public static void main(String[] args) {
		start();
}
	private static void start() {
	sc = new Scanner(System.in);

	System.out.println("┌────────────────────────────────────┐");	
	System.out.println("│　　　　　　   숫자.두뇌게임　　　  　　　  　│");
	System.out.println("└────────────────────────────────────┘");
	System.out.println("┌────────────────────────────────────┐");
	System.out.println("│1.게임시작　 　　           2.게임설명             　  　│");
	System.out.println("└────────────────────────────────────┘");
	System.out.println("┌────────────────────────────────────┐");
	System.out.println("│3.게임종료　 　　            by. 이상훈　   　  　│");
	System.out.println("└────────────────────────────────────┘");
	int number = sc.nextInt();
	if (number <= 0 || number >= 4) 
	{System.out.println("잘못된 입력입니다. 다시 입력하세요"); start();}
	if (number == 1) {playing();};
	if (number == 2) {explain1(); }
	if (number == 3) {sc.close(); System.out.println("bye bye!");}	}
	
	private static void explain1() {sc1 = new Scanner(System.in);
	System.out.println("게임 시작시 랜덤으로 3x3칸이 생성되고, 각 칸마다 0과 5를 포함한 그 사이의 숫자가 랜덤으로 생성됩니다.");
	System.out.println("┌──────┬──────┬──────┐　　　　　　　┌──────┬──────┬──────┐");
	System.out.println("│ 0000 │ 0000 │ 0000 │　　　　　　　│  00  │  01  │  02  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0000 │ 0000 │ 0000 │　　　　　　　│  10  │  11  │  12  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0000 │ 0000 │ 0000 │　　　　　　　│  20  │  21  │  22  │");
	System.out.println("└──────┴──────┴──────┘　　　　　　　└──────┴──────┴──────┘");
	System.out.println("이 9칸의 숫자 중 6개만 같은 숫자로 맞추시면 클리어입니다!");
	System.out.println("추가로 9칸의 숫자 중 5칸이 같은숫자이면서 나머지 4칸도 같은숫자여도 클리어입니다!");
	System.out.println("여러분의 이해를 위해 모든 칸의 숫자가 0인 3x3칸을 만들었습니다.");
	System.out.println("오른쪽에 보이는 칸이 각 칸이 가지고 있는 번호입니다. 여러분은 번호를 이용해 번호에 맞는 왼쪽의 칸의 주변의 값을 추가할 수 있습니다.");
	System.out.println("예를들어 11번 번호를 입력하겠습니다. 그럼 어떻게될까요?\n");
	System.out.println("　　　　　　　　　　　　2. 다음설명 　　　　　　　0. 초기화면");
	int explainSC1 = sc1.nextInt();
	if(explainSC1 != 0 && explainSC1 != 2)
	{System.out.println("잘못된 입력입니다. 다시 입력하세요"); explain1();}
	if(explainSC1 == 2) {explain2();}
	if(explainSC1 == 0) {start();}	}
	
	private static void explain2() {sc2 = new Scanner(System.in);
	System.out.println("┌──────┬──────┬──────┐　　　　　　　┌──────┬──────┬──────┐");
	System.out.println("│ 0000 │ 0001 │ 0000 │　　　　　　　│  00  │  01  │  02  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0001 │ 0000 │ 0001 │　　　　　　　│  10  │  11  │  12  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0000 │ 0001 │ 0000 │　　　　　　　│  20  │  21  │  22  │");
	System.out.println("└──────┴──────┴──────┘　　　　　　　└──────┴──────┴──────┘");
	System.out.println("짜잔! 11번 주변에 있는 칸인 01번, 10번, 12번, 21번의 값이 1씩 추가되었네요.");
	System.out.println("그럼 이번에는 12번을 입력해보겠습니다.\n");
	System.out.println("1. 이전설명　　　　　　　2. 다음설명 　　　　　　　0. 초기화면");
	int explainSC2 = sc2.nextInt();
	if(explainSC2 == 1) { explain1(); }
	if(explainSC2 == 2) { explain3(); }
	if(explainSC2 == 0) { start();	}
	if(explainSC2 != 1 && explainSC2 != 2 && explainSC2 != 0)
	{System.out.println("잘못된 입력입니다. 다시 입력하세요"); explain2();}}
	
	private static void explain3() {sc3 = new Scanner(System.in);
	System.out.println("┌──────┬──────┬──────┐　　　　　　　┌──────┬──────┬──────┐");
	System.out.println("│ 0000 │ 0001 │ 0001 │　　　　　　　│  00  │  01  │  02  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0001 │ 0001 │ 0001 │　　　　　　　│  10  │  11  │  12  │");
	System.out.println("├──────┼──────┼──────┤　　　　　　　├──────┼──────┼──────┤");
	System.out.println("│ 0000 │ 0001 │ 0001 │　　　　　　　│  20  │  21  │  22  │");
	System.out.println("└──────┴──────┴──────┘　　　　　　　└──────┴──────┴──────┘");
	System.out.println("이번에도 12번 주변에 있는 칸인 02번, 11번, 22번의 값이 1씩 추가되었네요.");
	System.out.println("이렇게 값을 추가하여 3x3안에 있는 칸의 9개의 값중 6개를 똑같이 만들거나 혹은");
	System.out.println("5칸이 같은숫자이면서 나머지 4칸이 같은숫자이면 클리어입니다!");
	System.out.println("1. 이전설명　　　　　　　　　　　　　　　　　0. 초기화면");
	int explainSC3 = sc3.nextInt();
	if(explainSC3 == 1) {explain2(); }
	if(explainSC3 == 0) {start(); }
	if(explainSC3 != 1 && explainSC3 != 0)
	{System.out.println("잘못된 입력입니다. 다시 입력하세요"); explain3();}}
	
	private static void playing() {

	int check = 0;
	int ar[][] = new int[3][3];
	int count = 0;
	Random r = new Random();
	System.out.println("새 게임을 만드는 중입니다. 잠시만 기다려 주십시오.");
	for(int i = 0; i<3; i++) {for(int j = 0; j<3; j++) { ar[i][j] = r.nextInt(6); }} 

	for(int i = 0; i<3; i++) {for(int j = 0; j<3; j++) {for(int l = 0; l<3; l++)
	{for(int k = 0; k<3; k++) {if( ar[i][j] == ar[l][k]){check++;}}}}}; // 랜덤으로 생성한 9개의 수가 모두같을경우
	if (check >= 39) {
	System.out.println("6개 이상의 칸이 같은숫자가 나왔네요! 로또 한장 사보세요.");
	System.out.println("다시 생성하겠습니다.");
	check = 0; playing();}
	System.out.println("┌──────┬──────┬──────┐"+"\t"+"┌──────┬──────┬──────┐");
	System.out.println("│ "+String.format("%04d",ar[0][0])+" │ "+String.format("%04d",ar[0][1])+" │ "+String.format("%04d",ar[0][2])+" │"+"\t"+"│  00  │  01  │  02  │");
	System.out.println("├──────┼──────┼──────┤"+"\t"+"├──────┼──────┼──────┤");
	System.out.println("│ "+String.format("%04d",ar[1][0])+" │ "+String.format("%04d",ar[1][1])+" │ "+String.format("%04d",ar[1][2])+" │"+"\t"+"│  10  │  11  │  12  │");
	System.out.println("├──────┼──────┼──────┤"+"\t"+"├──────┼──────┼──────┤");
	System.out.println("│ "+String.format("%04d",ar[2][0])+" │ "+String.format("%04d",ar[2][1])+" │ "+String.format("%04d",ar[2][2])+" │"+"\t"+"│  20  │  21  │  22  │");
	System.out.println("└──────┴──────┴──────┘"+"\t"+"└──────┴──────┴──────┘");
	System.out.println("사용할 칸을 입력하세요.(앞자리 수가 0이면 0 생략가능)    게임종료 : 9");
	sc4 = new Scanner(System.in);
	int a = 0;	check = 0;
	do {System.out.println();
	a = sc4.nextInt(); check = 0;
	if(a == 9) {System.out.println("bye bye!"); break;}
	if(a < 0 || (a > 2 && a < 10) ||  (a > 12 && a < 20) || a > 22 ) 
	{System.out.println("잘못 입력하셨습니다. 다시 입력하세요"); continue;}
	if(a % 10 == 0) {ar[a / 10][1] += 1;}
	if(a % 10 == 1) {ar[a / 10][0] += 1; ar[a / 10][2] += 1;}
	if(a % 10 == 2) {ar[a / 10][1] += 1;}
	if(a / 10 == 0) {ar[1][a % 10] += 1;}
	if(a / 10 == 1) {ar[0][a % 10] += 1; ar[2][a % 10] += 1;}
	if(a / 10 == 2) {ar[1][a % 10] += 1;}

	System.out.println("┌──────┬──────┬──────┐"+"\t"+"┌──────┬──────┬──────┐");
	System.out.println("│ "+String.format("%04d",ar[0][0])+" │ "+String.format("%04d",ar[0][1])+" │ "+String.format("%04d",ar[0][2])+" │"+"\t"+"│  00  │  01  │  02  │");
	System.out.println("├──────┼──────┼──────┤"+"\t"+"├──────┼──────┼──────┤");
	System.out.println("│ "+String.format("%04d",ar[1][0])+" │ "+String.format("%04d",ar[1][1])+" │ "+String.format("%04d",ar[1][2])+" │"+"\t"+"│  10  │  11  │  12  │");
	System.out.println("├──────┼──────┼──────┤"+"\t"+"├──────┼──────┼──────┤");
	System.out.println("│ "+String.format("%04d",ar[2][0])+" │ "+String.format("%04d",ar[2][1])+" │ "+String.format("%04d",ar[2][2])+" │"+"\t"+"│  20  │  21  │  22  │");
	System.out.println("└──────┴──────┴──────┘"+"\t"+"└──────┴──────┴──────┘");
	count ++; 
	for(int i = 0; i<3; i++) {for(int j = 0; j<3; j++) {for(int l = 0; l<3; l++) {for(int k = 0; k<3; k++) {if( ar[i][j] == ar[l][k]){check++;}}}}};
	//System.out.println(check);
	if(check >= 39) {break;}
	System.out.println("사용할 칸을 입력하세요.(앞자리 수가 0이면 0 생략가능)    게임종료 : 9");
	System.out.println("시도 횟수 : " + count);
	
	} while(check < 39); 
	if(check >= 39) {
	System.out.println("축하합니다 클리어하셨습니다! \\('･w・)ノ");
	System.out.println("시도 횟수 : " + count);}
	//for(int i = 0; i<3; i++) {    for(int j = 0; j<3; j++) { System.out.println(ar[i][j]);   }  };

	sc4.close();







	}
}



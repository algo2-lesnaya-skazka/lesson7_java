
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����� ����� ������: ");
		int mes=in.nextInt();
		String mesString;
		switch (mes) {
		case 1: mesString = "����";
		break;
		case 2: mesString = "����";
		break;
		case 3: mesString = "�����";
		break;
		case 4: mesString = "�����";
		break;
		case 5: mesString = "�����";
		break;
		case 6: mesString = "����";
		break;
		case 7: mesString = "����";
		break;
		case 8: mesString = "����";
		break;
		case 9: mesString = "�����";
		break;
		case 10: mesString = "�����";
		break;
		case 11: mesString = "�����";
		break;
		case 12: mesString = "����";
		break;
		default: mesString = "������� ����� ������ 1-12!!!";
		break;
		}
		System.out.print("��� ����� ����: " + mesString);
		in.close();
		}
	
}

public class Main {

//�������� �����, ������� �������� �������� ���������� ���� Integer.
// �������� ����� changeValue, ������� ��������� �������� ���� Integer ��� ��������� value.
// ������ ������ � ������� ��������� ������������ �������� � �������� �������� 22.

    public static void changeValue(Integer value) {
        value = 22;
    }

    //� ������ main �������� ���������� ���� Integer ��� ��������� value � �������� ���� �������� 33.
    public static void main(String[] args) {
        int value = 33;
        // � ��������� ������ �������� ����� changeValue � ��������� � ���� ��� ����������.
        changeValue(value);
        System.out.println(value);


    }
    //�������� �����, ������� �������� �������� ���������� ���� int.
// �������� ����� changeValue, ������� ��������� �������� ���� int ��� ��������� value.
// ������ ������ � ������� ��������� ������������ �������� � �������� �������� 22.

    public static void changeValue(int value) {
        value = 22;
    }

    //� ������ main �������� ���������� ���� int ��� ��������� value � �������� ���� �������� 33.
    public static void mainSecond(String[] args) {
        int value = 33;
        // � ��������� ������ �������� ����� changeValue � ��������� � ���� ��� ����������.
        changeValue(value);
        System.out.println(value);

    }
}
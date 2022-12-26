import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        String[] arrayChar = str.split("");
        int count;
        List<String> strings = new ArrayList<>();

        Set<String> stringList1 = new LinkedHashSet<>();

        for (String s:arrayChar) {
            if(!s.equals(" ")){
                stringList1.add(s);
            }
        }

        List<Integer> integersCount = new ArrayList<>();

        for (String s : stringList1) {
            count = 0;
            for (String s1 : arrayChar) {
                if (s.equals(s1)) {
                    count++;
                }
            }
            strings.add(s);
            integersCount.add(count);
        }
        System.out.println(strings);
        System.out.println(integersCount);
    }
}

package Tugas1;

public class Soal3 {
    public static void main(String[] args) {
        System.out.println(countCameICaseWords("SatuDuaTiga"));

        System.out.println((countCameICaseWords("SaveChangeInEditor")));
    }

    public static int countCameICaseWords(String cameLICaseString) {
        if (cameLICaseString == null || cameLICaseString.isEmpty()) {
            return 0;
        }

        int count = 1;
        for (char c : cameLICaseString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;

    }
}

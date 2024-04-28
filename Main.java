import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        System.out.println("Input: ");

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(calculator(input));
    }

    public static String calculator(String input) throws Exception {


        String[] arr = input.split("\"");


        String a;
        String b;
        String c;

        if (arr.length == 3) {
            a = arr[1];
            b = arr[2];
            c = null;
        } else if (arr.length == 4) {
            a = arr[1];
            b = arr[3];
            c = arr[2];
        } else throw new Exception("Nah");


        String[] aa = a.split("");
        if (aa.length > 10) {
            throw new Exception("NOT");
        }


        if (c == null) {
            return CalculatorUmnoDel(b, a);
        } else return CalculatorPlusMinus(c, b, a);


    }

    public static String CalculatorUmnoDel(String b, String a) throws Exception {
        b = b.trim();
        String[] bb = b.split("");
        String second = bb[bb.length - 1];
        String second2 = bb[bb.length - 2];
        String second3 = second2 + second;

        String u = null;

        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < arr.length; i++){
            u = arr[i];
        if (second3.equals("10") && bb[0].equals("*") || second3.equals("10") && bb[0].equals("/") || second.equals(u) && bb[0].equals("*") || second.equals(u) && bb[0].equals("/")) {
            return (calcUmnoDel(a, b));
        }}
        throw new Exception("Neee");
    }



    public static String CalculatorPlusMinus(String c, String b, String a) throws Exception {
        c = c.trim();
        String[] bb = b.split("");
        if (bb.length <= 10 && (c.equals("+") || c.equals("-"))) {
            return (calcPlusMinus(c, a, b));
        } else throw new Exception("Nein");
    }

    static private String calcPlusMinus(String c, String a, String b) throws Exception {
        String plus;
        String minus;

        if (c.equals("+")) {
            plus = a + b;
            return "\"" + plus + "\"";

        } else if (c.equals("-")) {
            minus = (a.replace(b, ""));
            return "\"" + minus + "\"";

        } else throw new Exception("Not");
    }


    static private String calcUmnoDel(String a, String b) throws Exception {

        int e = e(b);

        String umno;
        String umno2;
        String del;
        String[] delProm;
        int sum = 0;
        int res;

        if (b.contains("*")) {
            umno = a.repeat(e);
            String[] umnoUmno = umno.split("");
            if (40 >= umnoUmno.length) {
                return "\"" + umno + "\"";
            } else {
                umno2 = umno.substring(0, 40) + "...";
                return umno2;
            }

        } else if (b.contains("/")) {
            delProm = a.split("");
            for (int i = 0; i < delProm.length; i++) {
                sum = sum + 1;
            }
            res = sum / e;
            del = a.substring(0, res);
            return "\"" + del + "\"";
        } else throw new Exception("Not");
    }


    public static int e(String b) throws Exception {

        String[] bb = b.split("[/*]");
        String second = bb[1];
        second = second.trim();

        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < arr.length; i++) {
            if (second.equals(arr[i])) {
                return Integer.parseInt(second);
            }
        } throw new Exception("NO");
    }
}


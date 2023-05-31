public class GroupProject {

    public static void main (String[] args) {
        //int sum = sumUp(1, 2);
        //System.out.println(sum);
        //System.out.println(returnSumAsString(3, 4));

        //System.out.println(calculateFactorial(5));
        System.out.println(otherWayToFaculty(6));

    }

    public static int sumUp(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static String returnSumAsString(int c, int d){
        int result = c + d;
        return "Summe: " + result;
    }

    public static int calculateFactorial(int number){
        int i;
        int result = 1;
        for (i = 1; i <= number; i++) {

            result = result * i;

        }
        return result;
    }

    public static int otherWayToFaculty(int x){
        int i;
        int result = x;
        for (i = x-1; i > 0; i--) {

            result = result * i;
            System.out.println(result);
    }
        return result;
    }

    public static int fac(int y){
        int i;
        while (i <= y) {

        }
    }

}


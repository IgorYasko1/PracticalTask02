package study.Triangle;

class TriangleChecker {

    static void checkTriangle(final int a, final int b, final int c){
        if (a <= 0 || b <= 0 || c <= 0 ){
            throw new IllegalArgumentException("Invalid parameter");
        }
        if (a < (b + c) && b < (a + c) && c < (b + a)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}


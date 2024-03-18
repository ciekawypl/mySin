public class ZadanieSin {
    public static void main(String[] args) {
        double x = 6.4;
        System.out.println(Math.sin(x));
        System.out.println(mySin(x, 6));
    }

    static double mySin(double x, int n){
        double pi = Math.PI;
        if (((int)(x/pi))%2 == 0){
            x = x%pi;
        } else{
            x = 0 - x%pi;
        }

        double wynik = x;
        int t = 1;
        long f = 1;
        for (int i = 1; i < n+1; i++) {
            t = t + 2;
            f = f*t*(t-1);
            wynik = wynik + (Math.pow(-1, i))*((Math.pow(x, t))/f);
        }
        return wynik;
    }
}

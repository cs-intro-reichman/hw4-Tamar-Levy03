public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]);
        boolean[] found = new boolean[N + 1];
        int p = 2;
        int j = 2;
        int counter = 0;
        for(int i = 2; i<=N; i++ ){
            found[i] = true;
        }
        while (p<(double)Math.sqrt(N)) {
            while (j*p<=N) {
                found[j*p] = false;
                j++;
                
            }
            do{
                p++;
            }while(found[p] == false);
            j = p;
        }
        System.out.println("Prime numbers up to " + N + ":");
        for(int x = 2; x<=N; x++){
            if (found[x] == true) {
                System.out.println(x);
                counter++;
            }
        }
        double percent = ((double)counter/N)*100;
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + (int)percent + "% are primes)");
    }
}
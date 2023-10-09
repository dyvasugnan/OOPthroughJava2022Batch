class Largest_prime {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largest_prime = findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largest_prime);
    }

    public static long findLargestPrimeFactor(long number) {
        long largestPrimeFactor = 1;
        
        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }
        
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }
        
        if (number > 2) {
            largestPrimeFactor = number;
        }
        
        return largestPrimeFactor;
    }
}

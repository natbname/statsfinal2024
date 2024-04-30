public class Library 
{
    public double lambda(double k, double n) //expercted and variance of poisson distribution. also used in poisson
    {
        return k / n;
    }

    public long longFactorial(int num) //orgininally from statslibrary1
    {
        Long temp = (long) 1; //holds total factorial. initalized at 1 to handle 0!
        Long iVal = (long) 1; //holds i value. starts at first loop val 1
        for (int i = 1; i <= num; i++) {
            iVal = (long) i; //casting i to long, this loop's factor
            temp = temp * i; //previous temp * i
        }
        return temp;
    }

    public double poisson(int y, double k, double n) //k and n passed to lambda
    {
        double pt1 = (Math.pow(lambda(k, n), y)) / (longFactorial(y));
        double pt2 = Math.exp(-1 * lambda(k, n));
        return pt1 * pt2; //divided for readability
    }

    public double chebyshev(int with, double mean, double stdev) //mean and stdev here have to be found before input here. "with" is within number
    {
        double k = with / stdev;
        return  1 - (1 / Math.pow(k, 2)); //conditional here?
    }

    public double contUniform(double a, double b, double c, double d) //only applicable for constants
    {
        return (d - c)/(b - a);
    }

    public double contUniformExpected(double a, double b) //intervals of y, where a <= y <= b
    {
        return (a + b) / 2;
    }

    public double contUniformVariance(double a, double b) 
    {
        return (Math.pow((b - a), 2)) / 12;
    }

    public long combination(int n, int r) //originally from statslibrary1
    {
        return longFactorial(n) / (longFactorial(r) * longFactorial(n - r));
    }

    public double jointCumulativeDistribution(int a, int b, int c, int y1, int y2, int choose) 
    {
        double pt1 = combination(a, y1) * (combination(b, y2) * combination(c, (choose - y1 - y2)));
        double pt2 = combination((a + b + c), choose);
        return pt1 / pt2;
    }
}

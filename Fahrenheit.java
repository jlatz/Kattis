public class Fahrenheit{
	public static void main(String...args){
        	int fahr;
        	int celsius;

        	int lower = 0;     //lower limit of temperature table
        	int upper = 300;   //upper limit
        	int step = 20;    //step size

        	fahr = lower;
        	while (fahr <= upper){
                	celsius = 5 * (fahr-32) / 9;
                	System.out.printf("%d\t%d\n", fahr, celsius);
                	fahr = fahr + step;
		}
        }
}

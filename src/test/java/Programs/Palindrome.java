package Programs;
import org.testng.annotations.Test;
import java.io.IOException;
public class Palindrome {
    @Test
    public static void checkPali() throws IOException {
        int x = 233392;
        int sum = 0, temp, rem, n;
        temp = x;
        while (x > 0) {
            rem = x % 10;
            sum = (sum * 10) + rem;
            x = x / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is palindrrome");
        } else {
            System.out.println(temp+ " is not  palindrrome");
        }
        palid2();
    }


   static void palid2()
    {
        String x = "1234321";
        String orig,reverse = "";
        orig=x;
        int len=x.length();
        for(int i=len-1;i>=0;i--){
        reverse=reverse+x.charAt(i);
        }
        System.out.println(reverse);

    }


}

package Programs;

import org.testng.annotations.Test;
public class ForCount {
    static final int MAX_CHAR = 256;
    @Test
    public static  void GetForCount(){
        String str="Raman DHiman";
        int len =10;
        int count[] = new int[MAX_CHAR];
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

    }
}

package plistaestaticasequencial;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        String[] palavras = new String[] {"boi", "vaca", "cabra", "bezerro"};
        
        Arrays.sort(palavras);
        
        
        for (String p : palavras) {
            System.out.println(p);
}

        
    }
}

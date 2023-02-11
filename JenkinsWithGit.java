package practice;

/**
 *
 * @author saad0
 */
public class JenkinsWithGits {
    public static void main(String[] args) {
        //code to print unicode Characters
        int charPerLine =0;
        for (int i = 33; i < 256; i++, charPerLine++) {
            System.out.print((char)i);
				System.out.print((charPerLine%10==0)?"\n":"\t");
            System.out.print("");
        }
    }
}
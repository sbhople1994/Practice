public class Demo1 {
    public static void main(String[] args) {

        String input = "aaabbbcccddaaaaaaabbbbbbb";

        int count = 1;

        StringBuffer sb = new StringBuffer();

        char [] c = input.toCharArray();

        int length = c.length;

        int i = 0;

        while(i < length-2){

            if(c[i] == c[i+1]){

                count++;

            }

            else{

                sb.append(count + String.valueOf(c[i]));

                count = 1;

            }

            i++;

        }

        if(c[length-2] == c[length -1]){

            count++;

            sb.append(count + String.valueOf(c[length-2]));

        }

        System.out.println(sb);

    }
}

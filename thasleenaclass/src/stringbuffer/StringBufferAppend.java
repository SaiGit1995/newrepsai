package stringbuffer;

public class StringBufferAppend 
{

    public static void main(String[] args) 
    {
    	StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        //sb.print(); // to print the result
        System.out.println(sb);
    }

}



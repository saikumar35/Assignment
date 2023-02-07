package stringpackage1;
//sai kumar
//210303126138
//19 division
public class String7 {
    //EqualsIgnoreCaseExample{

    public static void main(String args[]){
        String s1="saikumar";
        String s2="saikumar";
        String s3="SAIKUMAR";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}



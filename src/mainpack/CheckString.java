package mainpack;

public class CheckString {
    public boolean success = true;

    public  CheckString(String to_check) {
        //System.out.println(to_check.length());
        if(to_check.length() < 1) {
            success = false;
        }else {
            char[] chars = to_check.toCharArray();
            for (char c : chars) {
                if(!Character.isLetter(c)) {
                    success = false;
                }
            }
        }
    }
}
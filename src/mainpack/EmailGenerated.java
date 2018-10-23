package mainpack;

public class EmailGenerated {
    public String e_mail;
    public int ile = 0;
    public EmailGenerated(String name, String surname, String[] T_TEMP){
        String name_s = name.toLowerCase();
        String surname_s = surname.toLowerCase();
        e_mail = name_s + "." + surname_s + "@mex.com";
        if(T_TEMP[0] != null){
            for (String aT_TEMP : T_TEMP) {
                if (aT_TEMP != null) {
                    if (aT_TEMP.equals(e_mail)) {
                        ++ile;
                        System.out.println(ile);
                        e_mail = name_s + "." + surname_s + ile + "@mex.com";
                    }
                }
            }
        }
    }
}

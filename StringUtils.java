
public class StringUtils {

	public static String tittleCase(String str) {
		String fullname="";
		if(str!=null && str.trim().length()>0){
			String strArr[] = str.split(" ");
		
		
		for(String st : strArr) {
				char ch = st.charAt(0);
				String ch2 = String.valueOf(ch);
				ch2=ch2.toUpperCase();
				String subString = st.substring(1);
				subString = subString.toLowerCase();
				fullname += ch2+subString+" ";
		}
		}
		return fullname;
	}
}

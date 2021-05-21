package Schoollevel;

public class ConvertStingtoLowerWithoutUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABcdAZScf";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char)((int)ch[i]+32);
			}
			else {
				ch[i]=ch[i];
			}
		}
		for(int k = 0; k < ch.length; k++)
	     {
	        System.out.print(ch[k]);
	     }
	}
	
	 

}

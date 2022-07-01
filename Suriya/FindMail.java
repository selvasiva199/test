package Suriya;

public class FindMail {
	public static void main(String[] args)throws MailException {
		String mail="Suriya111.com";
		try {
		if(mail.contains("@")) {
			throw new MailException("its used");
		}else {
			System.out.println("not used");
		}
		}catch(MailException me) {
			System.out.println(me.getMessage());
		}
		System.out.println("final");
		}
	

}

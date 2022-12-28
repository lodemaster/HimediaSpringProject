package spring;

public class MemberInfoPrinter {

	
	
	private MemberDao memberDao;
	private MemberInfoPrinter printer;
	
	public void printerMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if(member == null ) {
			System.out.println("일치하는 회원 정보가 없습니다.");
			return;
		}
	}
}

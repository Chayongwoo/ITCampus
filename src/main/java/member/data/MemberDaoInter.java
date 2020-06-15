package member.data;

public interface MemberDaoInter {
	//ȸ�� ����(ȸ�� �߰�)
	public void insertMember(MemberDto dto);
	//ȸ�� ���� ����
	public void updateMember(MemberDto dto);
	//ȸ�� ����
	public void deleteMember(MemberDto dto);
	//ȸ�� num���� ȸ�� ��ȸ
	public MemberDto selectOneMember(int membernum);
	//ȸ�� id�� ȸ�� ��ȸ
	public MemberDto selectNameMember(String member_id);
	//ȸ�� �˻�
	public MemberDto searchMember(String field, String searchtxt);
	//ȸ�� id�ִ��� ��ȸ
	public int checkid(String member_id);
	//�α���- id, password�� Ȯ��
	public int isCheckPass(String member_id,String member_password);
	//������ ã��
	public MemberDto admin();
	//���̵� �缳�� ���� ���� Ȯ��
	public int selectCountId(String member_name, String member_email, String member_phone);
	//�ش� �̸����� ȸ�� ���̵�
	public String selectId(String member_email);
	//��й�ȣ �缳�� ���� ���� Ȯ��
	public int selectCount(String member_name, String member_id, String member_phone);
	//��й�ȣ �缳��
	public void updatePassword(String member_id, String member_password);

}
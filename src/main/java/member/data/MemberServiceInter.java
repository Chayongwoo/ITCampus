package member.data;

public interface MemberServiceInter {
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
	public boolean checkId(String member_id); //����
	public int checkId2(String member_id); //���
	//�α���- id, password�� Ȯ��
	public boolean isCheckPass(String member_id,String member_password);

}

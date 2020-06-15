package member.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import upload.util.ManageFileClass;

@RestController
@CrossOrigin
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/login/loginck")
	public Map<String,String> loginck(@RequestParam String member_id, @RequestParam String member_password
			,@RequestParam(required=false) String idsave,HttpSession session)
	{
		Map<String, String> map = new HashMap<String, String>();
		if(service.isCheckPass(member_id, member_password))
		{
		
		System.out.println("id:"+member_id+",pw:"+member_password);
		System.out.println("react>>login ");
		
		map.put("member_name",service.selectNameMember(member_id).getMember_name());
		map.put("success","success");
		return map;
		}
		else
		{
			System.out.println("react>>login fail");
			map.put("fail","fail");
			return map;
		}
	}
	
	
	@GetMapping("/member/idcheck")
	public int idcheck(@RequestParam String id)
	{
		System.out.println("react >> idcheck"+","+id);
		
		int idcheck = service.checkId2(id);
		System.out.println("idcheck:"+idcheck);
		
		return idcheck;
	}
	
	@PostMapping("/member/insert")
	public void insertMember(@RequestParam String member_name,
			@RequestParam String member_id,
			@RequestParam String member_password,
			@RequestParam String member_phone,
			@RequestParam String member_email,
			@RequestParam String member_address,
			@RequestParam String member_detailaddr
			)
	{
		MemberDto memberdto = new MemberDto();
		
		memberdto.setMember_name(member_name);
		memberdto.setMember_id(member_id);
		memberdto.setMember_password(member_password);
		memberdto.setMember_phone(member_phone);
		memberdto.setMember_email(member_email);
		memberdto.setMember_address(member_address);
		memberdto.setMember_detailaddr(member_detailaddr);
		
		System.out.println("react >> insert, "+ memberdto.getMember_id());
		
		service.insertMember(memberdto);
	}
	

	
	
}
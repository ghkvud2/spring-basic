package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {

		return "";
	}

	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods, String food) {

		System.out.println("가장 좋아하는 음식 : " + food);

		System.out.println("좋아하는 음식");
		for (String f : foods) {
			System.out.print(f);
		}
		return String.format("title : %s, content : %s, category : %s", title, content, category);
	}

	@RequestMapping("edit")
	public String edit() {
		return "";
	}

}

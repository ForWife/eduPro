package com.neu.controller;

import com.neu.service.BackGetAllMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BackCircleOfFriendShowHandler {
	@Autowired
	private BackGetAllMessageService backGetAllMessageService;
//	@RequestMapping(value = "/back/back_getAllMessage")
//	@ResponseBody
//	public List<Message> getAllMessage(HttpServletRequest request) throws Exception{
//		List<Message> result = backGetAllMessageService.getAllMessage(1);
//		for(Message r : result) {
//			for(MessageImg m : ((Message) r).getMessageImg()) {
//				System.out.println(request.getServletContext().getRealPath("/"));
//				File file = new File(request.getServletContext().getRealPath("/") + m.getImgurl());
//				System.out.println(file.getCanonicalPath());
//				FileInputStream fis = new FileInputStream(file);
//				BufferedImage bufferedImg = ImageIO.read(fis);
//				int imgWidth = bufferedImg.getWidth();
//				int imgHeight = bufferedImg.getHeight();
//				if(imgWidth > imgHeight) {
//					m.setFlag(0);
//				}else {
//					m.setFlag(1);
//				}
//			}
//		}
//		System.out.println(result);
//		System.out.println("测试");
//		return result;
//	}
}

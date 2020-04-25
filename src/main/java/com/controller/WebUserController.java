package com.controller;

import com.entity.MailBean;
import com.entity.User;
import com.entity.WebUser;
import com.excel.ExcelException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.WebUerService;
import com.util.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.zxing.Result;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lvhong on 2019/2/26.
 */
@Controller
@RequestMapping("webUserController")
public class WebUserController {
    @Autowired
    private WebUerService webUerService;
    @Autowired
    private MailUtil mailUtil;
//    @Autowired
//    private  RedisUtil redisUtil;
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @Autowired
//    private RabbitTemplate template;
    @Autowired
    private ObjectMapper objectMapper;
//    @Autowired
//    private MongoTemplate mongoTemplate;
//    @GetMapping("/sendDirect")
//    private @ResponseBody String sendDirect(String message) throws Exception {
//        User user = new User(UUID.randomUUID().toString(), message, "123456", "sendDirect");
//        String jsonString = objectMapper.writeValueAsString(user);
//        template.convertAndSend("CalonDirectExchange", "l", jsonString);
//        return "OK,sendDirect:" + message;
//    }
//    @GetMapping("/sendTopicFirst")
//    private @ResponseBody String sendTopicFirst(String message) {
//        User user = new User(UUID.randomUUID().toString(), message, "123456", "sendTopicFirst");
//        template.convertAndSend("topicExchange", "topic.first", user);
//        return "OK,sendTopicFirst:" + message;
//    }

//    @GetMapping("/sendTopicSecond")
//    private @ResponseBody String sendTopicSecond(String message) {
//        User user = new User(UUID.randomUUID().toString(), message, "123456", "sendTopicSecond");
//        template.convertAndSend("topicExchange", "topic.#", user);
//        return "OK,sendTopicSecond:" + message;
//    }
    @RequestMapping("/queryUser")
    public String queryInvoiceByShopIdAndUserId(Model model, Long fShopId) {
        return "index";
    }

    @RequestMapping("/queryUserList")
    @ResponseBody
    public String queryInvoiceByShopIdAndUserIds(MailBean mailBean)  {
        String message = "邮件已经发送请查收";
    /*   List<WebUser> webUsers = webUerService.selectUserList();*/
        mailUtil.sendSimpleMail(mailBean);
        return "已经发送成功,请查收邮件";
//        User user = new User(UUID.randomUUID().toString(), message, "123456", "sendDirect");
//        try {
//            String jsonString = objectMapper.writeValueAsString(mailBean);
//            template.convertAndSend("CalonDirectExchange", "CalonDirectRouting", jsonString);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            message = "系统繁忙请稍后再试";
//        }
//        return message;
    }
    @RequestMapping("/getUserListPage")
    @ResponseBody
    public PageBean getUserListPage(PageBean pageBean) {
//       pageBean = webUerService.selectUserList(pageBean);
//        for (int i =0 ;i<1000; i++){
//            redisUtil.set("lvhong"+i,pageBean);
//        }
//        out.println(redisUtil.get("lvhong3"));
      /*  mongoTemplate.save(pageBean);*/
//        Query query=new Query(Criteria.where("sort").is("DESC"));
//         pageBean =  mongoTemplate.findOne(query , PageBean.class);
//        pageBean = (PageBean)redisUtil.get("lvhong3");
//        redisTemplate.opsForHash().put("lisi","123456","中华人民共和国");
//        Object lisi = redisTemplate.boundHashOps("lisi").get("123456");
        return pageBean;
    }

    @RequestMapping(value = "/mynearby")
    public String mynearby(Model model, Long fShopId) {
        return "mynearby";
    }

    /**
     * 生成二维码
     */
    @GetMapping("/Qrcode")
    public void productcode() {
        QrCodeUtils.zxingCodeCreate("http://www.aiqinghai.club/webUserController/queryUser", "C:/Users/lvhong/Desktop/布加迪/",500,"C:/Users/lvhong/Desktop/布加迪/5.jpg");
    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public void analysiscode() {
        Result result = QrCodeUtils.zxingCodeAnalyze("D:/voice/picture/2018/759.jpg");
        System.err.println("二维码解析内容："+result.toString());
    }
   /* *//**
     * 解析二维码
     */
   /* @GetMapping("/export_")
    public void export_(HttpServletResponse response) throws ExcelException, UnsupportedEncodingException {
        List<WebUser> webUsers = webUerService.selectUserLists();
        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
        fieldMap.put("fUserAccount","账号");
        fieldMap.put("fUserEmail","邮箱账号");
        fieldMap.put("fUserPhone","手机号");
        ExcelUtil.listToExcel(webUsers,fieldMap,"自己定义的",response);
    }*/
    @GetMapping("/export_")
    public void export_(HttpServletResponse response) throws ExcelException, UnsupportedEncodingException {
        List<WebUser> webUsers = webUerService.selectUserLists();
        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
        fieldMap.put("fUserAccount","账号");
        fieldMap.put("fUserEmail","邮箱账号");
        fieldMap.put("fUserPhone","手机号");
        ExcelUtil.listToExcel(webUsers,fieldMap,"自己定义的",response);
    }
    @RequestMapping(value = "/import")
    public String exImport(@RequestParam(value = "filename")MultipartFile file, HttpSession session,HttpServletResponse response) throws IOException {
        boolean a = false;
        InputStream is = file.getInputStream();
//        response.setCharacterEncoding("utf-8");//pdf 转换成图片
//        response.setContentType("application/msword");
//        String fileName = "发票.png";
//        fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
//        response.setHeader("Content-Disposition", "attachment; filename="+fileName);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        PDDocument doc = PDDocument.load(is);
//        PDFRenderer renderer = new PDFRenderer(doc);
//        int pageCount = doc.getNumberOfPages();
//        for (int i = 0; i < pageCount; i++) {
//            BufferedImage image = renderer.renderImageWithDPI(i, 144); // Windows native DPI
//            ImageIO.write(image, "png",out);
//        }
//        BufferedInputStream  bis = new BufferedInputStream( new ByteArrayInputStream(out.toByteArray()));
//        BufferedOutputStream   bos = new BufferedOutputStream(response.getOutputStream());
//        int len = 2048;
//        byte[] b = new byte[len];
//        while ((len = bis.read(b)) != -1) {
//            bos.write(b, 0, len);
//        }
//        bos.flush();
//        bis.close();
//        bos.close();
        LinkedHashMap<String, String> fieldMap = new LinkedHashMap<>();
        String fileName = file.getOriginalFilename();
        fieldMap.put("账号","fUserAccount");
        fieldMap.put("邮箱账号","fUserEmail");
        fieldMap.put("手机号","fUserPhone");
        try {
            String[] uniqueFields = {"账号","邮箱账号","手机号"};
            List<WebUser> webUsers = ExcelUtil.excelToList(is, fileName, WebUser.class, fieldMap, uniqueFields);
            webUerService.insrtList(webUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:mynearby";
    }
    @GetMapping(value = "/createWord")
    public void createWord(HttpServletResponse response) {
        /** 用于组装word页面需要的数据 */
        Map<String, Object> dataMap = new HashMap<String, Object>();

        /** 组装数据 */
        dataMap.put("userName", "lvhong");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        dataMap.put("date", sdf.format(new Date()));

        dataMap.put("content", "freeMark生成Word文档段落内容");
        List<WebUser> listInfo = webUerService.selectUserLists();

//        List<Map<String, Object>> listInfo = new ArrayList<Map<String, Object>>();
//        for (int i = 1; i <= 10; i++) {
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("fUserAccount", "标题" + i);
//            map.put("fUserEmail", "内容" + i);
//            map.put("fUserPhone", "作者" + i);
//            listInfo.add(map);
//        }
        dataMap.put("listInfo", listInfo);

        /** 文件名称，唯一字符串 */
        Random r = new Random();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        StringBuffer sb = new StringBuffer();
        sb.append(sdf1.format(new Date()));
        sb.append("_");
        sb.append(r.nextInt(100));

        //文件路径
        String    filePath = "D:/doc_f/";

        //文件唯一名称
        String  fileOnlyName = "用freemarker生成Word文档_" + sb + ".doc";

        //文件名称
        String fileName = "用freemarker生成Word文档.doc";

        /** 生成word */
        WordUtil.createWord(dataMap, "freeMark.til", filePath, fileOnlyName,response);
    }



}

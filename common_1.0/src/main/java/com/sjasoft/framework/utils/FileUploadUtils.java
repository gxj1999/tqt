package com.sjasoft.framework.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUploadUtils {
	/**
	 * 图片上传
	 * @param request
	 * 			请求
	 * @return
	 * 			图片上传的路径
	 * @throws IllegalStateException
	 * @throws IOException
	 */
    public static List<String> upload(HttpServletRequest request, String path)
            throws IllegalStateException, IOException {

    	List<String> imagePathList = new ArrayList<String>();
//        定义一个变量来 存储路径
        // 创建一个通用的多部分解析器
        CustomMultipartResolver multipartResolver = new CustomMultipartResolver();
        multipartResolver.getFileUpload();
        // 判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            // 转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // 取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                // 取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    // 取得当前上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
//                    截取取得文件后缀
                    String suffixName = myFileName
                            .substring(myFileName.lastIndexOf(".") + 1);

//                    自动生成名称
                    String newName = UUID.randomUUID().toString();
                    // 如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim() != "") {
                        System.out.println(myFileName);
                        // 重命名上传后的文件名
                        File targetPath = new File(path);
//                        如果文件名不存在，创建一个空的
                        if (!targetPath.exists()) {
                            targetPath.mkdirs();
                        }
//                        拼上生成的文件名称+截取的后缀
                        File targetFile = new File(path,newName + "." + suffixName);
//                        根据一个Url拷贝字节到一个文件中 (HttpServletRequest提供了一个getInputStream()方法，该方法返回的是检索ServletInputStream的request的实体的二进制数据+生成的文件)
                        FileUtils.copyInputStreamToFile(file.getInputStream(), targetFile);
                        // 保存图片路径
//                        imagePathList.add("upload/video/" + newName + "." + suffixName);
                        imagePathList.add(newName + "." + suffixName);
                    }
                }
            }

        }
		return imagePathList;
    }
}

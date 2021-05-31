package com.sjasoft.framework.utils;

import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.ProgressListener;
/**
 * 文件上传
 * @author xiatianlong
 *
 * @date 2016年4月18日 下午5:14:09
 */
public class FileUploadProgressListener implements ProgressListener {
    
    @SuppressWarnings("unused")
	private HttpSession session;

    private double uploadRate = 0.0;
    private int percentDone =0;
    private long usedTime = 0;
    private long uploadSize = 0;
    private long allSize = 0;
    private int whichItem = 0;
    private long beginTime = System.currentTimeMillis();
    private long currentTime = System.currentTimeMillis();
    
    public FileUploadProgressListener (HttpSession session){
        this.session = session;
    }

    public void update(long pBytesRead, long pContentLength, int pItems) {

        currentTime = System.currentTimeMillis();
        whichItem = pItems;
        allSize = pContentLength; // byte
        uploadSize = pBytesRead;  // byte
        usedTime = currentTime - beginTime; // ms
        if (usedTime != 0)
            uploadRate = pBytesRead / usedTime; // byte/ms
        else
            uploadRate = 0.0;
        if (pContentLength == 0)
            return;
        
        percentDone = (int) Math.round(100.00 * pBytesRead / pContentLength); // 百分比

    }

    public double getUploadRate() {
        return uploadRate;
    }

    public int getPercentDone() {
        return percentDone;
    }

    public long getUsedTime() {
        return usedTime;
    }

    public long getUploadSize() {
        return uploadSize;
    }

    public long getAllSize() {
        return allSize;
    }

    public int getWhichItem() {
        return whichItem;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public long getCurrentTime() {
        return currentTime;
    }
    
}

package com.example.servicebestpractice;

public interface DownloadListener {
    void onProgress(int progress); //通知当前下载进度
    void onSuccess(); //通知当前下载成功事件
    void onFailed(); //通知下载失败事件
    void onPaused(); //通知下载暂停事件
    void onCanceled(); //通知下载取消事件
}

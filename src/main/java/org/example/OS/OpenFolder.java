package org.example.OS;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFolder {
    public static void main(String[] args) {
        // 要打开的文件夹路径（例如 C 盘下的 "test" 文件夹）
        String folderPath = "D:\\PengfeiChess\\PengfeiChess-5.8.8.2"; // Windows 路径用双反斜杠转义
        File folder = new File(folderPath);

        // 检查文件夹是否存在
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("文件夹不存在或路径错误：" + folderPath);
            return;
        }

        try {
            // 使用系统默认的文件浏览器打开文件夹
            if (Desktop.isDesktopSupported()) { // 检查系统是否支持 Desktop 功能
                Desktop desktop = Desktop.getDesktop();
                desktop.open(folder); // 打开文件夹
                System.out.println("已打开文件夹：" + folderPath);
            } else {
                System.out.println("当前系统不支持 Desktop 功能");
            }
        } catch (IOException e) {
            System.out.println("打开文件夹失败：" + e.getMessage());
        }
    }
}

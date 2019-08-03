package part_03.Mar23.demo03;

import java.io.File;
import java.io.FileFilter;

/*  创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则  */
public class FileFilterImpl implements FileFilter {
    /**
     * accept
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     */
    @Override
    public boolean accept(File pathname) {
        /*  过滤的规则:
            在accept方法中,判断File对象是否是以.java结尾
            是就返回true
            不是就返回false  */

        //如果pathname是一个文件夹,直接返回true,表示这个文件夹的资源符合过滤条件
        if(pathname.isDirectory()){
            return true;
        }
        //如果不是文件夹，则判断文件名是否以.java结尾
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}


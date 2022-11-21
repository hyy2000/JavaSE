package com.lesson;
/* - File(String pathname)：根据一个路径得到File对象
    - File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
    - File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象(将一个父级路径封装成File类，可以方便的使用File里的功能和方法)
    * 例  全路径: D:\\aaa\\ddd.txt
父级路径D:\\aaa   子级路径ddd.txt*/

/*
* - public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了，创建成功返回true
- public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了   单级文件夹
- public boolean mkdirs():创建多级文件夹,如果父文件夹不存在，会帮你创建出来

注意:
	1.在创建了File对象后,如果不调用对应的创建方法,文件或文件夹是创建无效的,必须配套使用才有效
		如果创建文件或者文件夹不写盘符路径，那么，默认在项目路径下

	2.window的路径分隔符使用“\”，而Java程序中的“\”表示转义字符，所以在Windows中表示路径，需要用“\\”。或者直接使用“/”也可以，Java程序支持将“/”当成平台无关的路径分隔符。*/

/*public boolean isDirectory():判断是否是目录  文件夹
public boolean isFile():判断是否是文件
public boolean exists():判断是否存在


- public boolean renameTo(File dest):把文件重命名为指定的文件路径
- public boolean delete():删除文件或者文件夹

- 重命名注意事项
	* 如果路径名相同，就是改名。
	* 如果路径名不同，就是改名并剪切。
- 删除注意事项：
	* Java中的删除不走回收站。
	* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹*/
import java.io.File;
import java.io.IOException;

public class IoTest1{
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        System.out.println(file.exists());

      //  file.renameTo(new File("test111"));
        //System.out.println(file.exists());

        //boolean delete = file.delete();
      //  System.out.println(delete);
        System.out.println(file.isFile());
        System.out.println(file.exists());



        file.delete();


    }
}

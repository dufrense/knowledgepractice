import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

import java.util.List;

/**
 * @author hacker
 * @date 2020/12/28 16:47
 * @describe
 */
public class PhoneNameTest {

    public static void main(String[] args) {

        List<String> fileNames = FileUtil.listFileNames("E:\\phone");
        for (String fileName : fileNames) {
            // /usr/local/mysql/phone
            // load data infile '/usr/local/mysql/phone/plain/phone.txt' into table phone;
            System.out.println(StrUtil.format("load data infile '/usr/local/mysql/phone/{}' into table phone;", fileName));
        }

    }



}

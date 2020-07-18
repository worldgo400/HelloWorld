package frank.util;

import org.junit.Assert;
import org.junit.Test;

public class DBUtilTest {
    //单元测试
    @Test
    public void t1(){
        Assert.assertNotNull(DBUtil.getConnection());
    }

}

package flumelog4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class WriteLog {
    protected static final Log logger = LogFactory.getLog(WriteLog.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // 每隔两秒log输出一下当前系统时间戳
            logger.info("hello world");
            Thread.sleep(2000);
            try {
                throw new Exception("exception msg");
            } catch (Exception e) {
                logger.error("error:" + e.getMessage());
            }
        }
    }
}

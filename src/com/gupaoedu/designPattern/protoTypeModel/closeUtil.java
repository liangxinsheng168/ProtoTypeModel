package com.gupaoedu.designPattern.protoTypeModel;

import java.io.Closeable;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class closeUtil {

    public static void close(Closeable ... closeables) {
        for(Closeable closeable : closeables) {
            if(closeable != null){
                try {
                    closeable.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

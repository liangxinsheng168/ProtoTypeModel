package com.gupaoedu.designPattern.protoTypeModel;

import java.io.*;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class optimusPrime extends transFormer implements Cloneable, Serializable {

    weapon wp = null;

    public optimusPrime() {
        wp = new weapon();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return this.deepClone();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public optimusPrime deepClone() {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            return (optimusPrime) obj;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            closeUtil.close(oos, ois);
        }
        return null;
    }

    public optimusPrime shallowClone() {
        optimusPrime prime = new optimusPrime();
        prime.name = this.name;
        prime.height = this.height;
        prime.weight = this.weight;
        prime.wp = this.wp;
        return prime;
    }
}

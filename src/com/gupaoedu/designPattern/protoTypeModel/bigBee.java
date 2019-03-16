package com.gupaoedu.designPattern.protoTypeModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class bigBee extends transFormer implements Cloneable {

    weapon wp = null;

    public bigBee() {
        wp = new weapon();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public bigBee deepClone() throws Exception {
        bigBee bee = new bigBee();
        bee.name = this.name;
        bee.height = this.height;
        bee.weight = this.weight;
        weapon wp = new weapon();
        bee.wp = wp;
        return bee;
    }

}

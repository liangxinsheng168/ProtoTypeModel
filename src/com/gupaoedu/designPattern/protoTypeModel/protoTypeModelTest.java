package com.gupaoedu.designPattern.protoTypeModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class protoTypeModelTest {

    public static void main(String[] args) throws Exception {

        optimusPrime prime = new optimusPrime();
        optimusPrime deepCopy = prime.deepClone();
        System.out.println(prime == deepCopy); //false
        System.out.println(prime.wp == deepCopy.wp); //false

        optimusPrime shallowCopy = prime.shallowClone();
        System.out.println(prime == shallowCopy); //false
        System.out.println(prime.wp == shallowCopy.wp); //true

        bigBee bee = new bigBee();
        bigBee beeCopy = bee.deepClone();
        System.out.println(bee == beeCopy); //false
        System.out.println(bee.wp == beeCopy.wp); //false

    }

}

package com.lrm.uitl;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-28 11:59
 * @Description :
 * 获取所有的属性值为空属性名数组
 */
public class MyBeanUtils {

    public static String[] getNullPropertyNames(Object source) {

        BeanWrapper beanWrapper = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = beanWrapper.getPropertyDescriptors();
        ArrayList<Object> nullPropertyNames = new ArrayList<>();

        for (PropertyDescriptor pd : pds) {
            String propertyName = pd.getName();
            if (beanWrapper.getPropertyValue(propertyName) == null) {
                nullPropertyNames.add(propertyName);
            }
        }
        return nullPropertyNames.toArray(new String[nullPropertyNames.size()]);
    }


}

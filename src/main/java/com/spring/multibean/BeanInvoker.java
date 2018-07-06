package com.spring.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BaseInterface> list;

    @Autowired
    private Map<String ,BaseInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BaseInterface baseInterface;

    public void say(){
        if(null != list && 0 != list.size()){
            System.out.println("list...");
            for(BaseInterface baseInterface : list){
                System.out.println(baseInterface.getClass().getName());
            }
        }else {
            System.out.println("List<BaseInterface> list is null!!!");
        }

        System.out.println();

        if(null != map && 0 != map.size()){
            System.out.println("map...");
            for (Map.Entry<String,BaseInterface> entry:map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue().getClass()
                .getName());
            }
        }else {
            System.out.println("Map<String,BaseInterface> map is null!!!");
        }

        System.out.println();

        if(null != baseInterface){
            System.out.println(baseInterface.getClass().getName());
        }else{
            System.out.println("baseInterface is null!!!");
        }
    }
}

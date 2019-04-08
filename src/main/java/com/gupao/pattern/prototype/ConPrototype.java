package com.gupao.pattern.prototype;

import java.util.List;

/**
 * 实现Cloneable
 * super.clone()为浅克隆
 *
 */
public class ConPrototype  implements Cloneable,ProtoType{
    private String name;

    private List list;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public ProtoType  clone(){
        Object object = null;
        try{
            object = super.clone();
        }catch (Exception e){
            System.out.println();
        }
        return (ProtoType) object;

    }
}

package com.gupao.pattern.prototype;


import java.io.*;
import java.util.List;

/**
 * 具体原型类：
 * 它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的克隆对象
 *
 */
public class ConcretePrototype implements ProtoType,Serializable {

    private static final long serialVersionUID = 2716052013000516013L;
    private String attr;

    private List list;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    /**
     * 克隆方法
     *
     * @return
     */
    public ProtoType clone() {
        ProtoType protolType = new ConcretePrototype();
        /**
         * 浅克隆:
         */
        ((ConcretePrototype) protolType).setAttr(this.attr);
        ((ConcretePrototype) protolType).setList(this.list);
        return protolType;
    }
    /**
     * 深克隆方法
     */
    public ProtoType deepClone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);
            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));

            return (ProtoType) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                bos.close();;
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}

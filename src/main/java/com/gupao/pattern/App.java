package com.gupao.pattern;

import com.gupao.pattern.prototype.ConcretePrototype;
import com.gupao.pattern.prototype.ProtoType;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        List list = new ArrayList();
        ProtoType protoType = new ConcretePrototype();
        ((ConcretePrototype) protoType).setAttr("1");
        ((ConcretePrototype) protoType).setList(list);
        ProtoType clone = ((ConcretePrototype) protoType).deepClone();
        System.out.println(((ConcretePrototype) protoType).getList()==((ConcretePrototype) clone).getList());
    }
}

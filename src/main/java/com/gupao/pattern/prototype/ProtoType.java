package com.gupao.pattern.prototype;

/**
 * 抽象原型类：
 * 声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至可以是具体实现类
 *
 */
public interface ProtoType {
    ProtoType clone();

}

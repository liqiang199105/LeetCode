package DesignPattern.ProtoType;

/**
 * Created by larkin on 2014/11/14.
 * Prototype Pattern:
 *  Specify the kinds of objects to create using a prototypical instance, and create
 *  new objects by copying this prototype.
 */
public class ProtoTypeClass implements Cloneable {
    @Override
    public ProtoTypeClass clone(){
        ProtoTypeClass protoTypeClass = null;
        try{
            protoTypeClass = (ProtoTypeClass)super.clone();

        } catch (CloneNotSupportedException e){

        }
        return  protoTypeClass;
    }
}

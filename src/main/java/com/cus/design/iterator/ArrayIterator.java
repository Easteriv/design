package com.cus.design.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author zhaojiejun
 * @date 2020/8/15 11:32 上午
 **/
public class ArrayIterator<E> implements Iterator<E> {
    private int cursor;
    private List<E> arrayList;

    public ArrayIterator(List<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if(cursor>=arrayList.size()){
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}

package service.impl;

import service.CountMap;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {

    List<T> list = new ArrayList<>();

    @Override
    public void add(T o) {
        list.add(o);
    }

    @Override
    public int getCount(T o) {
        int count = 0;
        for (T item : list) {
            if (item == o) count++;
        }
        return count;
    }

    @Override
    public int remove(T o) {
        int count = 0;
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T cur = iterator.next();
            if (cur == o) {
                count++;
                iterator.remove();
            }
        }
        return count;
    }

    @Override
    public int size() {
        int n = (int) list.stream().distinct().count();
        return n;
    }

    @Override
    public void addAll(CountMap<T> source) {
        for (T t : source) {
            list.add(t);
        }
    }

    @Override
    public Map toMap() {
        HashMap<T, Integer> objectObjectHashMap = new HashMap<>();
        list.forEach(t -> objectObjectHashMap.put(t, getCount(t)));
        return objectObjectHashMap;
    }

    @Override
    public void toMap(Map destination) {
        list.forEach(t -> destination.put(t, getCount(t)));
    }


    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}

package com.cwc.iquestweeks.week8.pb1;

import java.util.Set;

public class MyCollectionImpl implements MyCollection<Set>{
    Set<Object> items;
    @Override
    public boolean containsAll(Set set) {
        for(Object o:set)
        {
            int ok=0;
            for(Object i:items)
            {
                if(i==o)
                {
                    ok=1;
                    break;
                }
            }
            if(ok==0)
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Set set) {
        try {
            for (Object o : set)
                items.add(o);
        }catch (Exception e)
        {
            return false;
        }
        return true;
    }
}

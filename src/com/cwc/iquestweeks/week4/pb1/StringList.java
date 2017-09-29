package com.cwc.iquestweeks.week4.pb1;


public class StringList implements List<String>{
    Integer[] numbers;

    /**
     * Addes an element to the list and checks if it is a valid Integer
     * @param element
     * @throws CException
     */
    @Override
    public void add(String element){
        Integer elementI;
        if(element==null)
            throw new CException(CException.NULL_VALUE_EXCEPTION);
        try{
            elementI=Integer.parseInt(element);
        }
        catch (Exception e)
        {
            throw new CException(CException.NOT_A_NUMBER);
        }
        Integer[] tmp=numbers;
        numbers=new Integer[numbers.length+1];
        for(int i=0;i<tmp.length;i++)
            numbers[i]=tmp[i];
        numbers[numbers.length-1]=elementI;
    }

    /**
     * Checks if the position is valid and returns the value requested
     * @param positon
     * @return String - the element requested
     */
    @Override
    public String get(int positon) {
        if(positon<0||positon>=numbers.length)
            throw new CException(CException.OUT_OF_BOUNDS);
        return numbers[positon].toString();
    }

    /**
     * Checks if the element searched for is a valid integer and then searches for it in the array
     * @param element
     * @throws CException
     * @return true if the element exists, false otherwise
     */
    @Override
    public boolean contains(String element) {
        Integer elementI;
        if(element==null)
            throw new CException(CException.NULL_VALUE_EXCEPTION);
        try{
            elementI=Integer.parseInt(element);
        }
        catch (Exception e)
        {
            throw new CException(CException.NOT_A_NUMBER);
        }
        for(Integer i:numbers)
            if(i==elementI)
                return true;
        return false;
    }

    /**
     * Uses the contains method to check if every element of the foreign list is contained
     * @param foreignList
     * @return false if an element isn't contained, true otherwise
     */
    @Override
    public boolean containsAll(List foreignList) {
        for(int i=0;i<foreignList.size();i++)
        {
            if(!contains(foreignList.get(i).toString()))
                return false;
        }
        return true;
    }

    /**
     * Gives the size of the array
     * @return Array length
     */
    @Override
    public int size() {
        return numbers.length;
    }
}

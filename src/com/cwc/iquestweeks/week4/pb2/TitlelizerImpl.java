package com.cwc.iquestweeks.week4.pb2;

public class TitlelizerImpl implements Titlelizer {
    /**
     * Capitalizes the first letter of words with exceptions: the, a, to, in, of
     * @param toTitlelize
     * @return the capitalized version of the string
     */
    @Override
    public String titlelize(String toTitlelize) {
        StringBuilder tempString = new StringBuilder();
        if (isSmallLetter(toTitlelize.charAt(0))) {
            if (!(toTitlelize.length() >= 4 && toTitlelize.substring(0, 4).equals("the ")) &&
                    !(toTitlelize.length() >= 2 && toTitlelize.substring(0, 2).equals("a ")) &&
                    !(toTitlelize.length() >= 3 && toTitlelize.substring(0, 3).equals("to ")) &&
                    !(toTitlelize.length() >= 3 && toTitlelize.substring(0, 3).equals("in ")) &&
                    !(toTitlelize.length() >= 3 && toTitlelize.substring(0, 3).equals("of "))
                    ) {
                tempString.append((char) (toTitlelize.charAt(0) - 32));
            }
            else
            {
                tempString.append((char) (toTitlelize.charAt(0)));
            }
        }
        else
        {
            tempString.append((char) (toTitlelize.charAt(0)));
        }
        for (int i = 1; i < toTitlelize.length(); i++) {
            if(toTitlelize.charAt(i-1)==' ' && isSmallLetter(toTitlelize.charAt(i)))
            {
                if ((!(toTitlelize.length() > i+4 && toTitlelize.substring(i, i+4).equals("the ")) &&
                        !(toTitlelize.length() > i+2 && toTitlelize.substring(i, i+2).equals("a ")) &&
                        !(toTitlelize.length() > i+3 && toTitlelize.substring(i, i+3).equals("to ")) &&
                        !(toTitlelize.length() > i+3 && toTitlelize.substring(i, i+3).equals("in ")) &&
                        !(toTitlelize.length() > i+3 && toTitlelize.substring(i, i+3).equals("of "))
                        ) &&
                        (!(toTitlelize.length() == i+3 && toTitlelize.substring(i, i+3).equals("the")) &&
                                !(toTitlelize.length() == i+1 && toTitlelize.substring(i, i+1).equals("a")) &&
                                !(toTitlelize.length() == i+2 && toTitlelize.substring(i, i+2).equals("to")) &&
                                !(toTitlelize.length() == i+2 && toTitlelize.substring(i, i+2).equals("in")) &&
                                !(toTitlelize.length() == i+2 && toTitlelize.substring(i, i+2).equals("of"))
                        ))  {
                    tempString.append((char) (toTitlelize.charAt(i) - 32));
                }
                else
                {
                    tempString.append((char) (toTitlelize.charAt(i)));
                }
            }
            else
            {
                tempString.append((char) (toTitlelize.charAt(i)));
            }
        }
        return tempString.toString();
    }

    /**
     * Checks if a char is a small letter
     * @param c
     * @return true if it is, false otherwise
     */
    public boolean isSmallLetter(char c) {
        if (c >= 'a' && c <= 'z')
            return true;
        return false;
    }
}

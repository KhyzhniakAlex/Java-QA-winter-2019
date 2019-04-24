package com.epam.javaQA.homework.Service;

import com.epam.javaQA.homework.Exceptions.ValidationException;

public class Validator {

    public String checkText(String text, String gap) throws ValidationException {

       if (text.length() < 3)
           throw new ValidationException(gap + " is invalid");
       else {
            for (char letter : text.toCharArray()) {
                int l = letter;
                if (!(l >= 65 && l <= 90 || l >= 97 && l <= 122 || l >= 1040 && l <= 1111))
                    throw new ValidationException(gap + " is invalid");
            }
       }

       return text;
    }

    public String checkDate(String date) throws ValidationException {

        if (date.length() != 4 || Integer.parseInt(date) > 2019)
            throw new ValidationException("Date is invalid");
        return date;
    }

    public <T> T checkDigit(T digit) throws ValidationException {

        if (digit instanceof Double) {
            if ((Double)digit < 0)
                throw new ValidationException("Price is invalid");
            return digit;
        }
        else {
            if ((Integer)digit < 5)
                throw new ValidationException("The gap 'pages' is invalid");
            return digit;
        }
    }
}

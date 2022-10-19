package org.example;

public class CharList {
    private char[] letters;
    int length;

    //constructors
    public CharList() {
        length = 0;
        letters = new char[0];
    }

    public CharList(String str) {
        length = str.length();
        letters = new char[str.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = str.charAt(i);
        }
    }

    public CharList(CharList other) {
        if (other == null) {
            System.out.println("This is null");
        } else {
            length = other.length;
            letters = new char[length];
            for (int i = 0; i < other.letters.length; i++) {
                letters[i] = other.letters[i];
            }
        }
    }

    public void add(char next) {
        char[] temp = new char[letters.length + 1];
        for (int i = 0; i < letters.length; i++) {
            temp[i] = letters[i];
        }
        temp[letters.length] = next;
        letters = new char[letters.length + 1];
        System.arraycopy(temp, 0, letters, 0, temp.length);
        length++;

        //int cN = countNull(letters);
        //System.arraycopy(cut(letters, cN), 0, letters, 0, letters.length - cN);
    }

    private int countNull(char[] c) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '\0')
                count++;
        }
        return count;
    }

    private char[] cut(char[] c, int nulls) {
        int ind = 0;
        char[] temp = new char[c.length - nulls];
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '\0') {
                temp[ind] = c[i];
                ind++;
            }
        }
        return temp;
    }

    public char get(int i) {
        return letters[i];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            result += letters[i];
        }
        return result;
    }

    public boolean equals(Object other) {
        if(other == null || !(other instanceof CharList))
            return false;

        CharList that = (CharList) other;
        if (letters.length != that.letters.length)
            return false;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == that.letters[i]) {
                //do nothing
            } else {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return length;
    }
}

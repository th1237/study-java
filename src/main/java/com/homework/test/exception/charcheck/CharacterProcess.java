package com.homework.test.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
        super();
    }

    public int countAlpha(String s){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ')
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

            else if(Character.isAlphabetic(s.charAt(i)))
                count++;

        }

        return count;
    }
}

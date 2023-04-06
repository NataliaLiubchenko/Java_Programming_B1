package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverseStr("java"));
        String fixed = StringUtil.fixFormat("tOM")+" is friend with "+StringUtil.fixFormat("JErrY");
        System.out.println(fixed);
        System.out.println(StringUtil.camelCase("JAVA iS gOOd LangUEGE"));


        System.out.println(StringUtil.frequencyOfCharacter("apple",'z'));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'p'));
    }
}

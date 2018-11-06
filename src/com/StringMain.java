package com;

/**
 * Created by gulfbank on 05/07/18.
 */
public class StringMain {

    public static void main(String args[]) throws Exception {
        System.out.println("String Main");

        String path ="/opt/WISE/Documents/Client Documents/70058383/P00000765/TRANSACTION CONFIRMATION/TC_451.pdf";
        System.out.println(path.replaceAll("/opt/WISE/Documents","/WISE"));

        System.out.println("Encrypted : " + JFBase64Impl.encryptData("/opt/WISE/Documents/Client Documents/70058383/P00000765/TRANSACTION CONFIRMATION/TC_451.pdf") );
        System.out.println("Decrypted : " + JFBase64Impl.decryptData("18gMrH5wEr0AqUNNCUR7tn2GwcZQEDTEVI5opuJ5zjEeqGyEoLiwtsQ4LRysxipuUtTNnE0k8jctaJNHTlAFGE35VhVgpn6OmG8+ztUh2zBWtkJm4B4DMjLifA=="));





    }
}

package com.bingbing.functionTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author : bingbing
 */
public class Test001 {

    public static void main(String[] args) {



    }

    @Test
    public void test() throws IOException {
        File dir=new File("/Users/mogu-office/Downloads/test/testIO");
        dir.mkdir();

        File file = new File("/Users/mogu-office/Downloads/test/testIO/1.txt");
        file.createNewFile();

    }


}

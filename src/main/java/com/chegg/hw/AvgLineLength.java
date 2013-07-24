package com.chegg.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 */
public class AvgLineLength {

    private static final int MODE_WORD = 0x00;
    private static final int MODE_CHARACTER = 0x01;

    public static void main(String args[]){
        Reader r;
        int mode = MODE_CHARACTER;
        try {
            for(int i = 0; i < args.length; i++){
                if(args[i].contains("-c")){
                    mode = MODE_CHARACTER;
                } else if (args[i].contains("-w")){
                    mode = MODE_WORD;
                }
            }

            if(args[args.length - 1] == "-"){
                r = new InputStreamReader(System.in);
            } else {
                r = new FileReader(args[args.length - 1]);
            }


            int lineCount = 0;
            int count = 0;

            BufferedReader lineReader = new BufferedReader(r);

            while(true){
                String line  = lineReader.readLine();

                if(line != null){
                    if(mode == MODE_WORD){
                        for(String s: line.split(" ")){
                            count++;
                        }
                    } else if (mode == MODE_CHARACTER){
                        count += line.length();
                    }
                    lineCount++;
                } else {
                    break;
                }
            }

            double avg = count / lineCount;
            System.out.println(avg);
        } catch (IOException e){

        }
    }
}

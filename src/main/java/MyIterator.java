import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Iterator;

public class MyIterator {

    public static void main(String[] argv) {
        int i = 0;
        int j = 0;
        Iterator it = FileUtils.iterateFiles(new File("/var/lib/cassandra"), null, true);
        while(it.hasNext()){
            File test = (File) it.next();
            String temp = test.toString();
            if(temp.contains("FunctionalSnapShot")){
                j = j + 1;

            }
            i = i + 1;

            System.out.println(test);
        }
        System.out.println("Total files " + i + " snampshot files " + j);


    }


}

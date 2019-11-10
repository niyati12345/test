package GoogleTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProps {
    static  Properties props;
    static  FileInputStream inputStream;
    public  String getProperty(String key) {
        props=new Properties();
        try {
            inputStream=new FileInputStream("src\\test\\resourcees\\TestData\\TestDataConfig.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            props.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }
}

package ngrok.version;

/**
 * Created by Administrator on 2019/9/2 0002.
 */
public class Version {
    final String Proto = "2";
    final String Major = "1";
    final String Minor = "7";

    public String MajorMinor(){
        return String.format("%s.%s", Major, Minor);
    }

    public String Full(){
        return String.format("%s-%s.%s", Proto, Major, Minor);
    }

    public boolean Compat(String client,String server){
        return client.equals(server);
    }
}

package BehavioralDP.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel){   // kanal ekleniyor
        this.channels.add(channel);
    }
    public void removeObserver(Channel channel){   // cikmak isteyen kanallari cikariyor
        this.channels.remove(channel);     // List cagiriliyor
    }
    public void setNews(String news){     // haberin kendisini alicak o yuzden string
        this.news=news;
        for (Channel channel:this.channels){
            channel.update(this.news);
        }
    }
}

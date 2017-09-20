package se.bonnierbroadcasting.sitedescription;

import se.claremont.autotest.websupport.DomElement;

/**
 * Created by jordam on 2017-04-02.
 */
public class TV4PlayNewsPage {

    public static DomElement newsPlayer(){
        return new DomElement("news-player-player", DomElement.IdentificationType.BY_CLASS);
    }
}

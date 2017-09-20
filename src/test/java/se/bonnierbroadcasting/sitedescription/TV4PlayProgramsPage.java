package se.bonnierbroadcasting.sitedescription;

import se.claremont.autotest.websupport.DomElement;

/**
 * Created by jordam on 2017-04-02.
 */
public class TV4PlayProgramsPage {

    public static DomElement nyheternaLink(){
        return new DomElement("Nyheterna", DomElement.IdentificationType.BY_LINK_TEXT);
    }
}
